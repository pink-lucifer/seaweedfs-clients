package seaweedfs.clients;

import com.google.gson.Gson;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.reactivex.netty.protocol.http.client.HttpClient;
import io.reactivex.netty.protocol.http.client.HttpClientRequest;
import io.reactivex.netty.protocol.http.client.HttpClientResponse;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import rx.Observable;
import rx.Single;
import seaweedfs.core.RxSeaweedfsOperations;
import seaweedfs.core.document.Document;
import seaweedfs.core.message.ErrorResult;
import seaweedfs.core.message.FilerPostResult;
import seaweedfs.core.support.SeaweedfsException;

import java.nio.charset.Charset;
import java.util.Optional;
import java.util.concurrent.CancellationException;

@Slf4j
public class RxSeaweedfsClient implements RxSeaweedfsOperations {
    private @NonNull
    HttpClient<ByteBuf, ByteBuf> httpClient;
    private @NonNull
    Gson gson;

    public RxSeaweedfsClient(HttpClient<ByteBuf, ByteBuf> httpClient, Gson gson) {
        this.httpClient = httpClient;
        this.gson = gson;
    }

    @Override
    public <D extends Document<?>> Single<FilerPostResult> upload(D d) {
        Observable<HttpClientResponse<ByteBuf>> responseObservable = httpClient.createPut(d.filerUrl())
                .setTransferEncodingChunked()
                .writeContent(Observable.just(d.bytebuf()));

        return Single.fromEmitter(e -> {
            e.setCancellation(() -> e.onError(new CancellationException()));
            responseObservable.doOnError(t -> e.onError(t))
                    .flatMap(br -> {
                                if (HttpResponseStatus.CREATED.equals(br.getStatus())
                                        || HttpResponseStatus.OK.equals(br.getStatus())) {
                                    br.getContent()
                                            .map(b -> gson.fromJson(b.toString(Charset.forName("utf-8")), FilerPostResult.class))
                                            .single().subscribe(f -> {
                                        e.onSuccess(f);
                                    });
                                } else {
                                    e.onError(new SeaweedfsException());
                                }
                                return Observable.empty();
                            }

                    ).subscribe();
        });
    }

    @Override
    public <D extends Document<?>> Single<FilerPostResult> update(D d) {
        return null;
    }

    @Override
    public <D extends Document<?>> Single<Optional<ErrorResult>> download(D d) {
        return streamDownload(d);
    }

    @Override
    public <D extends Document<?>> Single<Optional<ErrorResult>> streamDownload(D d) {
        HttpClientRequest<ByteBuf, ByteBuf> clientRequest = httpClient.createGet(d.filerUrl())
                .setTransferEncodingChunked();
        return Single.fromEmitter(e -> {
            e.setCancellation(() -> e.onError(new CancellationException()));
            clientRequest.doOnError(t -> e.onError(t))
                    .flatMap(br -> {
                        if (HttpResponseStatus.OK.equals(br.getStatus())) {
                            CompositeByteBuf compositeByteBuf = Unpooled.compositeBuffer();
                            br.getContent()
                                    .replayable()
                                    .autoRelease()
                                    .subscribe(b -> compositeByteBuf.addComponent(b));
                            d.from(compositeByteBuf);
                            e.onSuccess(Optional.empty());
                        } else {
                            e.onError(new SeaweedfsException());
                        }
                        return Observable.empty();
                    }).subscribe();
        });
    }
}

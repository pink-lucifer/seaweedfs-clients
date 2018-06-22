package seaweedfs.clients;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.util.internal.StringUtil;
import io.reactivex.netty.channel.ContentSource;
import io.reactivex.netty.channel.DisposableContentSource;
import io.reactivex.netty.protocol.http.client.HttpClient;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import rx.Observable;
import seaweedfs.core.SeaweedfsOperations;
import seaweedfs.core.document.Document;
import seaweedfs.core.message.ErrorResult;
import seaweedfs.core.message.FilerPostResult;

import java.nio.charset.Charset;
import java.util.Optional;

@Slf4j
public class SeaweedfsClient implements SeaweedfsOperations {
    private @NonNull
    HttpClient<ByteBuf, ByteBuf> httpClient;
    private @NonNull
    Gson gson;

    public SeaweedfsClient(HttpClient<ByteBuf, ByteBuf> httpClient, Gson gson) {
        this.httpClient = httpClient;
        this.gson = gson;
    }

    @Override
    public <D extends Document<?>> FilerPostResult upload(D d) {
        return httpClient.createPut(d.filerUrl())
                .setTransferEncodingChunked()
                .writeContent(Observable.just(d.bytebuf()))
                .flatMap(br -> {
                            ContentSource<ByteBuf> content = br.getContent();
                            if (HttpResponseStatus.CREATED.equals(br.getStatus())
                                    || HttpResponseStatus.OK.equals(br.getStatus())) {
                                return content.map(b -> gson.fromJson(b.toString(Charset.forName("utf-8")), FilerPostResult.class));
                            } else {
                                return content.map(b -> gson.fromJson(b.toString(Charset.forName("utf-8")), JsonElement.class))
                                        .map(j -> {
                                            FilerPostResult filerPostResult = new FilerPostResult();
                                            JsonObject object = j.getAsJsonObject();
                                            String error = object.get("error").getAsString();
                                            filerPostResult.setError(error);
                                            return filerPostResult;
                                        }).singleOrDefault(new FilerPostResult(br.getStatus().toString()));
                            }
                        }

                ).toBlocking().single();
    }

    @Override
    public <D extends Document<?>> FilerPostResult update(D d) {
        return null;
    }

    @Override
    public <D extends Document<?>> Optional<ErrorResult> download(D d) {
        return streamDownload(d);
    }

    @Override
    public <D extends Document<?>> Optional<ErrorResult> streamDownload(D d) {
        ErrorResult error1 = httpClient.createGet(d.filerUrl())
                .setTransferEncodingChunked()
                .flatMap(br -> {
                    ContentSource<ByteBuf> content = br.getContent();
                    if (HttpResponseStatus.OK.equals(br.getStatus())) {
                        CompositeByteBuf compositeByteBuf = Unpooled.compositeBuffer();
                        content.replayable()
                                .autoRelease()
                                .subscribe(b -> compositeByteBuf.addComponent(b));
                        d.from(compositeByteBuf);
                        return null;
                    } else {
                        return content.map(b -> gson.fromJson(b.toString(Charset.forName("utf-8")), JsonElement.class))
                                .map(j -> {
                                    ErrorResult errorResult = new ErrorResult();
                                    JsonObject object = j.getAsJsonObject();
                                    String error = object.get("error").getAsString();
                                    errorResult.setError(error);
                                    return errorResult;
                                }).singleOrDefault(new ErrorResult(br.getStatus().toString()));
                    }
                }).toBlocking().single();

        return Optional.ofNullable(error1);
    }
}

package seaweedfs.core;

import rx.Single;
import seaweedfs.core.document.Document;
import seaweedfs.core.message.ErrorResult;
import seaweedfs.core.message.FilerPostResult;

import java.util.Optional;

public interface RxSeaweedfsOperations {
    <D extends Document<?>> Single<FilerPostResult> upload(D d);

    <D extends Document<?> > Single<FilerPostResult> update(D d);

    <D extends Document<?> > Single<Optional<ErrorResult>> download(D d);

    <D extends Document<?> > Single<Optional<ErrorResult>> streamDownload(D d);
}

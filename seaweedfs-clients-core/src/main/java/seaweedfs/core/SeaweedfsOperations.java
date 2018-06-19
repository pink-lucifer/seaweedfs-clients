package seaweedfs.core;

import seaweedfs.core.document.Document;
import seaweedfs.core.message.ErrorResult;
import seaweedfs.core.message.FilerPostResult;

import java.util.Optional;

public interface SeaweedfsOperations {
    <D extends Document<?> > FilerPostResult upload(D d);

    <D extends Document<?> > FilerPostResult update(D d);

    <D extends Document<?> > Optional<ErrorResult> download(D d);

    <D extends Document<?> > Optional<ErrorResult> streamDownload(D d);
}

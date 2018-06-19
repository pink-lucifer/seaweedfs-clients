package seaweedfs.core.support;

import seaweedfs.core.message.ErrorResult;

public class SeaweedfsErrorTranslator {
    public static SeaweedfsException translate(ErrorResult errorResult){
        return new SeaweedfsException();
    }
}

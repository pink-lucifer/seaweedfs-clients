package seaweedfs.core.support;

import seaweedfs.core.message.ErrorResult;

public class SeaweedfsException extends RuntimeException {
    private ErrorResult errorResult;

    public SeaweedfsException() {
        super();
    }

    public SeaweedfsException(String message) {
        super(message);
    }

    public SeaweedfsException(String message, Throwable cause) {
        super(message, cause);
    }

    public SeaweedfsException(Throwable cause) {
        super(cause);
    }

    public void setErrorMessage(ErrorResult errorResult){
        this.errorResult = errorResult;
    }

    @Override
    public String toString() {
        return "SeaweedfsException{" +
                "errorMessage=" + errorResult +
                "} " + super.toString();
    }
}

package seaweedfs.core.support;

public class ServiceNotAvailableException extends SeaweedfsException {

    public ServiceNotAvailableException() {
        super();
    }

    public ServiceNotAvailableException(String message) {
        super(message);
    }

    public ServiceNotAvailableException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceNotAvailableException(Throwable cause) {
        super(cause);
    }
}
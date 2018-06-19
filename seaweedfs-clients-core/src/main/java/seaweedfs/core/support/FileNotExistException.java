package seaweedfs.core.support;

public class FileNotExistException extends SeaweedfsException{

    public FileNotExistException() {
        super();
    }

    public FileNotExistException(String message) {
        super(message);
    }

    public FileNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileNotExistException(Throwable cause) {
        super(cause);
    }
}

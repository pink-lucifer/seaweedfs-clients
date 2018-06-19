package seaweedfs.core.document;

import java.time.Duration;
import java.util.Objects;

public abstract class AbstractDocument<T> implements Document<T> {

    private String id;
    private String name;
    private String url;
    private String filerUrl;
    private Duration expiry;
    private T content;

    /**
     * Constructor needed for possible subclass serialization.
     */
    protected AbstractDocument() {
    }

    protected AbstractDocument(String id, Duration expiry, T content) {
        if (Objects.nonNull(expiry) && expiry.isNegative()) {
            throw new IllegalArgumentException("The Document expiry must not be negative.");
        }
        this.id = id;
        this.expiry = expiry;
        this.content = content;
    }

    public AbstractDocument(String id, String name, String url, String filerUrl, Duration expiry, T content) {
        if (Objects.nonNull(expiry) && expiry.isNegative()) {
            throw new IllegalArgumentException("The Document expiry must not be negative.");
        }
        this.id = id;
        this.name = name;
        this.url = url;
        this.filerUrl = filerUrl;
        this.expiry = expiry;
        this.content = content;
    }

    @Override
    public String id() {
        return id;
    }

    @Override
    public String url() {
        return url;
    }

    @Override
    public String filerUrl() {
        return filerUrl;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public Duration expiry() {
        return expiry;
    }

    @Override
    public T content(){
        return content;
    };
}

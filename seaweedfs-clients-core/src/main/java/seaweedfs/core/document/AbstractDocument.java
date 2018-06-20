package seaweedfs.core.document;

import io.netty.buffer.ByteBuf;

import java.time.Duration;
import java.util.Objects;

abstract class AbstractDocument<T> implements Document<T> {

    private String id;
    private Long size;
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

    /**
     * Constructor needed for upload/update process.
     *
     * @param expiry
     * @param content
     */
    protected AbstractDocument(String filerUrl, String name, Duration expiry, T content) {
        if(Objects.isNull(filerUrl) || filerUrl.isEmpty()){
            throw new IllegalArgumentException("The Document filerUrl must not be empty.");
        }
        if (Objects.nonNull(expiry) && expiry.isNegative()) {
            throw new IllegalArgumentException("The Document expiry must not be negative.");
        }
        this.filerUrl = filerUrl;
        this.name = name;
        this.expiry = expiry;
        this.content = content;
    }

    /**
     * Constructor needed for download process.
     *
     * @param name
     * @param filerUrl
     */
    protected AbstractDocument(String name, String filerUrl) {
        if(Objects.isNull(name) || name.isEmpty()){
            throw new IllegalArgumentException("The Document name must not be empty.");
        }
        if(Objects.isNull(filerUrl) || filerUrl.isEmpty()){
            throw new IllegalArgumentException("The Document filerUrl must not be empty.");
        }
        this.name = name;
        this.filerUrl = filerUrl;
    }

    /**
     * All args constructor.
     *
     * @param id
     * @param size
     * @param name
     * @param url
     * @param filerUrl
     * @param expiry
     * @param content
     */
    protected AbstractDocument(String id, Long size, String name, String url, String filerUrl, Duration expiry, T content) {
        if (Objects.nonNull(expiry) && expiry.isNegative()) {
            throw new IllegalArgumentException("The Document expiry must not be negative.");
        }
        this.id = id;
        this.size = size;
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
    public Long size() {
        return size;
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

    public void setId(String id) {
        this.id = id;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setFilerUrl(String filerUrl) {
        this.filerUrl = filerUrl;
    }

    public void setExpiry(Duration expiry) {
        this.expiry = expiry;
    }

    public void setContent(T content) {
        this.content = content;
    }

    @Override
    public abstract ByteBuf bytebuf();

    @Override
    public abstract void from(ByteBuf byteBuf);
}

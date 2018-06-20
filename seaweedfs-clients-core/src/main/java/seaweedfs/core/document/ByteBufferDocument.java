package seaweedfs.core.document;

import io.netty.buffer.ByteBuf;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.time.Duration;

public class ByteBufferDocument extends AbstractDocument<ByteBuffer> implements Serializable {

    private static final long serialVersionUID = -8595733871742353858L;

    /**
     * Creates a {@link ByteBufferDocument} which the document filerUrl and name.
     *
     * @param filerUrl
     * @param name
     * @return
     */
    public static ByteBufferDocument create(String filerUrl, String name) {
        return new ByteBufferDocument(filerUrl, name, Duration.ZERO, null);
    }

    /**
     * Creates a {@link ByteBufferDocument} which the document filerUrl and content.
     *
     * @param filerUrl
     * @param content
     * @return
     */
    public static ByteBufferDocument create(String filerUrl, ByteBuffer content) {
        return new ByteBufferDocument(filerUrl, null, Duration.ZERO, content);
    }

    /**
     * Private constructor which is called by the static factory methods eventually.
     *
     * @param filerUrl
     * @param name
     * @param expiry
     * @param content
     */
    private ByteBufferDocument(String filerUrl, String name, Duration expiry, ByteBuffer content) {
        super(filerUrl, name, expiry, content);
    }

    @Override
    public ByteBuf bytebuf() {
        return null;
    }

    @Override
    public void from(ByteBuf byteBuf) {

    }
}

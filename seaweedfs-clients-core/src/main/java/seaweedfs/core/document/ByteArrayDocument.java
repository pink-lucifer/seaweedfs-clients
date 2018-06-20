package seaweedfs.core.document;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.time.Duration;

public class ByteArrayDocument extends AbstractDocument<byte[]> implements Serializable {

    private static final long serialVersionUID = 3399274807129682917L;

    /**
     * Creates a {@link ByteArrayDocument} which the document filerUrl and name.
     *
     * @param filerUrl
     * @param name
     * @return
     */
    public static ByteArrayDocument create(String filerUrl, String name) {
        return new ByteArrayDocument(filerUrl, name, Duration.ZERO, null);
    }

    /**
     * Creates a {@link ByteArrayDocument} which the document filerUrl and content.
     *
     * @param filerUrl
     * @param content
     * @return
     */
    public static ByteArrayDocument create(String filerUrl, String name, byte[] content) {
        return new ByteArrayDocument(filerUrl, name, Duration.ZERO, content);
    }

    /**
     * Private constructor which is called by the static factory methods eventually.
     *
     * @param filerUrl
     * @param name
     * @param expiry
     * @param content
     */
    private ByteArrayDocument(String filerUrl, String name, Duration expiry, byte[] content) {
        super(filerUrl, name, expiry, content);
    }

    @Override
    public ByteBuf bytebuf() {
        return Unpooled.wrappedBuffer(content());
    }

    @Override
    public void from(ByteBuf byteBuf) {
        this.setContent(ByteBufUtil.getBytes(byteBuf));
    }
}

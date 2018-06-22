package seaweedfs.clients;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import seaweedfs.core.document.ByteArrayDocument;
import seaweedfs.core.message.ErrorResult;
import seaweedfs.core.message.FilerPostResult;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Optional;

import static seaweedfs.clients.TestsConfiguration.GSON;
import static seaweedfs.clients.TestsConfiguration.HTTP_CLIENT;

@Slf4j
@RunWith(BlockJUnit4ClassRunner.class)
public class SeaweedfsClientTest {
    private SeaweedfsClient seaweedfsClient;
    @Before
    public void init(){
        seaweedfsClient = new SeaweedfsClient(HTTP_CLIENT, GSON);
    }

    @Test
    public void upload() throws IOException {
        String pwd = System.getenv("PWD");
        String dir = "/avatar/png/";
        String filename = "awesome-vscode-logo.png";
        String filePath = pwd + "/../test/images/awesome-vscode-logo.png";
        File file = new File(filePath);
        //RandomAccessFile file = new RandomAccessFile(filePath, "r");
        //DefaultFileRegion fileRegion = new DefaultFileRegion(file.getChannel(), 0, file.length());
        ByteBuf byteBuf = Unpooled.wrappedBuffer(Files.readAllBytes(file.toPath()));

        ByteArrayDocument document = ByteArrayDocument.create(dir + filename, filename);
        document.from(byteBuf);
        FilerPostResult result = seaweedfsClient.upload(document);
        log.debug("upload test done, result: {}", result);
        Assert.assertNotNull(result);
        Assert.assertTrue(result.getError().isEmpty());
    }

    @Test
    public void download(){
        String dir = "/avatar/png/";
        String filename = "awesome-vscode-logo.png";
        ByteArrayDocument document = ByteArrayDocument.create(dir + filename, filename);
        Optional<ErrorResult> optional = seaweedfsClient.download(document);

        optional.ifPresent(e->log.debug("error {}", e));
    }

    @Test
    public void streamDownload(){
        String dir = "/avatar/png/";
        String filename = "awesome-vscode-logo.png";
        ByteArrayDocument document = ByteArrayDocument.create(dir + filename, filename);
        Optional<ErrorResult> optional = seaweedfsClient.streamDownload(document);

        optional.ifPresent(e->log.debug("error {}", e));
    }

    @After
    public void teardown(){

    }
}

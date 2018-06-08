package seaweedfs.filer.feignapi;

import feign.Response;
import lombok.extern.slf4j.Slf4j;
import okio.Buffer;
import okio.BufferedSink;
import okio.Okio;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.io.*;

import static seaweedfs.filer.feignapi.TestConfigurations.SEAWEED_FS_FILER_OKHTTP3;

@Slf4j
@RunWith(BlockJUnit4ClassRunner.class)
public class SeaweedFsFilerTest {

    @Test
    public void upload() throws FileNotFoundException {
        String pwd = System.getenv("PWD");
        String dir = "avatar/png";
        String filename = "awesome-vscode-logo.png";
        String filePath = pwd + "/../test/images/awesome-vscode-logo.png";
        File file = new File(filePath);
        FilerPostResult result = SEAWEED_FS_FILER_OKHTTP3.upload(dir, filename, file);
        Assert.assertNotNull(result);
        log.debug(result.toString());
    }

    @Test
    public void update() throws FileNotFoundException {
        String pwd = System.getenv("PWD");
        String dir = "avatar/png";
        String filename = "awesome-vscode-logo.png";
        String filePath = pwd + "/../test/images/awesome-vscode-logo.png";
        File file = new File(filePath);
        FilerPostResult result = SEAWEED_FS_FILER_OKHTTP3.update(dir, filename, file);
        Assert.assertNotNull(result);
        log.debug(result.toString());
    }

    @Test
    public void download() throws IOException {
        String dir = "avatar/png";
        String filename = "awesome-vscode-logo.png";
        Response response = SEAWEED_FS_FILER_OKHTTP3.download(dir, filename);
        int status = response.status();
        if(status == 200){
            InputStream inputStream = response.body().asInputStream();
            FileOutputStream fos = new FileOutputStream("awesome-vscode-logo.png");
            BufferedSink sink = Okio.buffer(Okio.sink(fos));
            sink.writeAll(okio.Okio.source(inputStream));
            fos.flush();
            fos.close();
        } else {
            log.debug("Download failure ... status code {}", status);
        }
    }

    @Test
    public void delete(){
        String dir = "avatar/png";
        String filename = "awesome-vscode-logo.png";
        SEAWEED_FS_FILER_OKHTTP3.delete(dir, filename);
    }
}

package seaweedfs.filer.retrofitapi;

import io.reactivex.Single;
import lombok.extern.slf4j.Slf4j;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import retrofit2.Call;
import retrofit2.Response;

import java.io.*;

@Slf4j
@RunWith(BlockJUnit4ClassRunner.class)
public class SeaweedFilerServiceTest {

    private final SeaweedFilerService service = TestConfigurations.RETROFIT.create(SeaweedFilerService.class);

    @Test
    public void upload(){
        //System.getenv().entrySet().forEach(e->System.out.printf("env key: %s, value: %s\n", e.getKey(), e.getValue()));
        String pwd = System.getenv("PWD");
        String path = "avatar/png/";
        String filePath = pwd + "/src/test/resources/images/awesome-vscode-logo.png";
        File file = new File(filePath);
        RequestBody requestBody = RequestBody.create(MediaType.parse("multipart/form-data"), file);
        MultipartBody.Part part = MultipartBody.Part.create(requestBody);
        Single<Response<FilerPostResult>> resultSingle = service.upload(path, part);
        resultSingle.doOnSuccess(r->{
            if(r.isSuccessful()){
                FilerPostResult body = r.body();
                log.debug(body.toString());
            }else {
                ResponseBody responseBody = r.errorBody();
                log.debug(responseBody.string());
            }
        }).doOnError(r->{
            r.getCause().printStackTrace();
        }).doFinally(
                ()->log.debug("finally")
        ).doAfterTerminate(
                ()->log.debug("Terminated")
        ).subscribe();
    }

    @Test
    public void upload2() throws FileNotFoundException {
        //System.getenv().entrySet().forEach(e->System.out.printf("env key: %s, value: %s\n", e.getKey(), e.getValue()));
        String pwd = System.getenv("PWD");
        String path = "avatar/png/";
        String filePath = pwd + "/src/test/resources/images/awesome-vscode-logo.png";
        File file = new File(filePath);
        //Source source = Okio.source(file);

        //BufferedSource bufferedSource = Okio.buffer(source);
        //InputStream inputStream = bufferedSource.inputStream();

        RequestBody requestBody = RequestBody.create(MediaType.parse("multipart/form-data"), file);
        MultipartBody.Part part = MultipartBody.Part.create(requestBody);
        Single<Response<FilerPostResult>> resultSingle = service.upload(path, part);

        resultSingle.doOnSuccess(r->{
            if(r.isSuccessful()){
                FilerPostResult body = r.body();
                log.debug(body.toString());
            }else {
                ResponseBody responseBody = r.errorBody();
                log.debug(responseBody.string());
            }
        }).doOnError(r->{
            r.getCause().printStackTrace();
        }).doFinally(
                ()->log.debug("finally")
        ).doAfterTerminate(
                ()->log.debug("Terminated")
        ).subscribe();
    }

    @Test
    public void update() {
        String pwd = System.getenv("PWD");
        String path = "avatar/png/";
        String filename = "awesome-vscode-logo.png";

        String pathToFile = path + filename;
        String filePath = pwd + "/src/test/resources/images/awesome-vscode-logo.png";
        File file = new File(filePath);
        RequestBody requestBody = RequestBody.create(MediaType.parse("multipart/form-data"), file);
        MultipartBody.Part part = MultipartBody.Part.create(requestBody);
        Single<Response<FilerPostResult>> resultSingle = service.update(pathToFile, part);

        resultSingle.doOnSuccess(r->{
            if(r.isSuccessful()){
                FilerPostResult body = r.body();
                log.debug(body.toString());
            }else {
                ResponseBody responseBody = r.errorBody();
                log.debug(responseBody.string());
            }
        }).doOnError(r->{
            r.getCause().printStackTrace();
        }).doFinally(
                ()->log.debug("finally")
        ).doAfterTerminate(
                ()->log.debug("Terminated")
        ).subscribe();

    }

    @Test
    public void update2() throws IOException {
        String pwd = System.getenv("PWD");
        String path = "avatar/png/";
        String fileName = "awesome-vscode-logo.png";
        String filePath = pwd + "/src/test/resources/images/";
        File file = new File(filePath + fileName);
        RequestBody requestBody = RequestBody.create(MediaType.parse("multipart/form-data"), file);
        MultipartBody.Part part = MultipartBody.Part.create(requestBody);
        //Single<Response<JsonObject>> resultSingle = service.update(path, part);
        Call<FilerPostResult> call = service.update2(path + fileName, part);

        Response<FilerPostResult> response = call.execute();
        //Object body = result.body();
        if(response.isSuccessful()){
            FilerPostResult body = response.body();
            System.out.println(body);
            //JsonObject object = (JsonObject)result.body();
            //object.keySet().forEach(e->System.out.printf("JsonObject key: %s, value: %s\n", e, object.get(e)));
        }else {
            ResponseBody responseBody = response.errorBody();
            FilerPostResult body = TestConfigurations.GSON.fromJson(responseBody.string(), FilerPostResult.class);
            System.out.println(body.toString());
        }

        //log.debug(" %s\n", result);
    }

    @Test
    public void update3() throws IOException {
        //System.getenv().entrySet().forEach(e->System.out.printf("env key: %s, value: %s\n", e.getKey(), e.getValue()));
        String pwd = System.getenv("PWD");
        String path = "avatar/png/";//awesome-vscode-logo.png
        String filePath = pwd + "/src/test/resources/images/awesome-vscode-logo.png";
        File file = new File(filePath);
        RequestBody requestBody = RequestBody.create(MediaType.parse("multipart/form-data"), file);
        MultipartBody.Part part = MultipartBody.Part.create(requestBody);
        //Single<Response<JsonObject>> resultSingle = service.update(path, part);
        FilerPostResult result = service.update3(path, part);
        System.out.println(result);

        //log.debug(" %s\n", result);
    }

    @Test
    public void delete(){
        String pathToFile = "http://127.0.0.1:9006/avatar/png/awesome-vscode-logo.png";
        service.delete(pathToFile)
                .doOnSuccess(r->{
                    if(r.isSuccessful()){
                        log.debug("file deleted...");
                    } else {
                        ResponseBody responseBody = r.errorBody();
                        log.debug("delete request is not successfully, http status code {}, error message {} ...", r.code(), responseBody.string());
                    }
                }).doOnError(t->{
            t.printStackTrace();
        }).subscribe();
    }

    @Test
    public void download(){
        String pathToFile = "http://127.0.0.1:9006/avatar/png/1.pdf";
        service.download(pathToFile)
                .doOnSuccess(r->{
                    if(r.isSuccessful()){
                        FileOutputStream fos = new FileOutputStream("awesome-vscode-logo.png");
                        BufferedSink sink = Okio.buffer(Okio.sink(fos));
                        sink.writeAll(r.body().source());
                        fos.flush();
                        fos.close();
                    } else {
                        ResponseBody responseBody = r.errorBody();
                        log.debug("download request is not successfully, http status code {}, error message {} ...", r.code(), responseBody.string());
                    }
                }).doOnError(t->{
                    t.printStackTrace();
        }).subscribe();
    }

    @Test
    public void streamDownload(){
        String pathToFile = "http://127.0.0.1:9006/avatar/png/awesome-vscode-logo.png";
        service.streamDownload(pathToFile)
                .doOnSuccess(r->{
                    if(r.isSuccessful()){
                        FileOutputStream fos = new FileOutputStream("awesome-vscode-logo.png");
                        BufferedSink sink = Okio.buffer(Okio.sink(fos));
                        sink.writeAll(r.body().source());
                        fos.flush();
                        fos.close();
                    } else {
                        ResponseBody responseBody = r.errorBody();
                        log.debug("download request is not successfully, http status code {}, error message {} ...", r.code(), responseBody.string());
                    }
                }).doOnError(t->{
            t.printStackTrace();
        }).subscribe();
    }
}

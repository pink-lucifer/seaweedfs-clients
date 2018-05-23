package com.github.lufs.seaweedfs.filer.retrofitapi;

import io.reactivex.Flowable;
import io.reactivex.Single;
import lombok.extern.slf4j.Slf4j;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import retrofit2.Call;
import retrofit2.Response;

import java.io.File;
import java.io.IOException;

@Slf4j
@RunWith(BlockJUnit4ClassRunner.class)
public class SeaweedFilerServiceTest {

    private final SeaweedFilerService service = TestConfigurations.RETROFIT.create(SeaweedFilerService.class);

    @Test
    public void upload(){
        //System.getenv().entrySet().forEach(e->System.out.printf("env key: %s, value: %s\n", e.getKey(), e.getValue()));
        String pwd = System.getenv("PWD");
        String path = "avarta/png/";
        String filePath = pwd + "/src/test/resources/images/awesome-vscode-logo.png";
        File file = new File(filePath);
        RequestBody requestBody = RequestBody.create(MediaType.parse("multipart/form-data"), file);
        MultipartBody.Part part = MultipartBody.Part.create(requestBody);
        Flowable<FilerPostResult> resultFlowable = service.upload(path, part);

        FilerPostResult result = resultFlowable.single(new FilerPostResult()).blockingGet();
        //log.debug(" %s\n", result);
    }

    @Test
    public void update() throws IOException {
        //System.getenv().entrySet().forEach(e->System.out.printf("env key: %s, value: %s\n", e.getKey(), e.getValue()));
        String pwd = System.getenv("PWD");
        String path = "avatar/png/";//awesome-vscode-logo.png
        String filePath = pwd + "/src/test/resources/images/awesome-vscode-logo.png";
        File file = new File(filePath);
        RequestBody requestBody = RequestBody.create(MediaType.parse("multipart/form-data"), file);
        MultipartBody.Part part = MultipartBody.Part.create(requestBody);
        //Single<Response<JsonObject>> resultSingle = service.update(path, part);
        Single<Response<FilerPostResult>> resultSingle = service.update(path, part);

        resultSingle.doOnSuccess(r->{
            if(r.isSuccessful()){

            }
        }).subscribeOn()

        Response<FilerPostResult> result = resultSingle.blockingGet();
        //Object body = result.body();
        if(result.isSuccessful()){
            FilerPostResult body = result.body();
            //JsonObject object = (JsonObject)result.body();
            //object.keySet().forEach(e->System.out.printf("JsonObject key: %s, value: %s\n", e, object.get(e)));
        }else {
            ResponseBody responseBody = result.errorBody();
            System.out.println(responseBody.string());
        }

        //log.debug(" %s\n", result);
    }

    @Test
    public void update2() throws IOException {
        //System.getenv().entrySet().forEach(e->System.out.printf("env key: %s, value: %s\n", e.getKey(), e.getValue()));
        String pwd = System.getenv("PWD");
        String path = "avatar/png/";//awesome-vscode-logo.png
        String filePath = pwd + "/src/test/resources/images/awesome-vscode-logo.png";
        File file = new File(filePath);
        RequestBody requestBody = RequestBody.create(MediaType.parse("multipart/form-data"), file);
        MultipartBody.Part part = MultipartBody.Part.create(requestBody);
        //Single<Response<JsonObject>> resultSingle = service.update(path, part);
        Call<FilerPostResult> call = service.update2(path, part);

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
}

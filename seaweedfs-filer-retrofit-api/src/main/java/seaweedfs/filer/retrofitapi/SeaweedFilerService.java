package seaweedfs.filer.retrofitapi;

import io.reactivex.Single;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface SeaweedFilerService {

    @Multipart
    @PUT
    Single<Response<FilerPostResult>> upload(@Url String url, @Part MultipartBody.Part part);

    @Multipart
    @POST
    Single<Response<FilerPostResult>> update(@Url String url, @Part MultipartBody.Part part);

    @Multipart
    @POST
    Call<FilerPostResult> update2(@Url String url, @Part MultipartBody.Part part);

    @Multipart
    @POST
    FilerPostResult update3(@Url String url, @Part MultipartBody.Part part);

    @DELETE
    Single<Response<ResponseBody>> delete(@Url String url);

    @GET
    Single<Response<ResponseBody>> download(@Url String url);

    @Streaming
    @GET
    Single<Response<ResponseBody>> streamDownload(@Url String url);
}

package com.github.lufs.seaweedfs.filer.retrofitapi;

import io.reactivex.Flowable;
import io.reactivex.Single;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface SeaweedFilerService {

    @Multipart
    @PUT
    Flowable<FilerPostResult> upload(@Url String url, @Part MultipartBody.Part part);

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
    Flowable<Response> remove(@Url String url, @Body RequestBody requestBody);

    @GET
    Flowable<Response> download(@Url String url);
}

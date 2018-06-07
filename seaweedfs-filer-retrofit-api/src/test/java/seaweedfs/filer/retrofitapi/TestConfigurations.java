package seaweedfs.filer.retrofitapi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

public class TestConfigurations {
    public static final Gson GSON = new GsonBuilder().create();

    private static final int DEFAULT_TIMEOUT = 20;
    private static final String BASE_URL = "http://127.0.0.1:9006/";
    private static final GsonConverterFactory GSON_CONVERTER_FACTORY = GsonConverterFactory.create(GSON);

    private static final OkHttpClient OK_HTTP_CLIENT =
            new OkHttpClient.Builder()
                    .addNetworkInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                    .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                    .writeTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                    .readTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                    .connectionPool(new ConnectionPool(1, 15, TimeUnit.SECONDS))
                    .build();

    public static final Retrofit RETROFIT = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GSON_CONVERTER_FACTORY)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(OK_HTTP_CLIENT)
            .build();
}

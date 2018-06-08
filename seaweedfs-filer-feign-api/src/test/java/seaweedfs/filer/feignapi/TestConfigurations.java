package seaweedfs.filer.feignapi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import feign.Feign;
import feign.form.FormEncoder;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import okhttp3.ConnectionPool;
import okhttp3.logging.HttpLoggingInterceptor;

import java.util.concurrent.TimeUnit;

public class TestConfigurations {
    public static final Gson GSON = new GsonBuilder().create();

    private static final int DEFAULT_TIMEOUT = 20;
    private static final String BASE_URL = "http://172.16.88.71:9006/";

    private static final okhttp3.OkHttpClient OK_HTTP_CLIENT =
            new okhttp3.OkHttpClient.Builder()
                    .addNetworkInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                    .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                    .writeTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                    .readTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                    .connectionPool(new ConnectionPool(1, 15, TimeUnit.SECONDS))
                    .build();

    public static final SeaweedFsFiler SEAWEED_FS_FILER_OKHTTP3 = Feign.builder()
            .encoder(new FormEncoder(new GsonEncoder(GSON)))
            .decoder(new GsonDecoder(GSON))
            .client(new OkHttpClient(OK_HTTP_CLIENT))
            .target(SeaweedFsFiler.class, BASE_URL);
}

package seaweedfs.filer.feignapi;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import feign.Response;

import java.io.File;

public interface SeaweedFsFiler {

    @RequestLine("PUT /{dir}/{name}")
    @Headers("Content-Type: multipart/form-data")
    FilerPostResult upload(@Param("dir") String dir, @Param("name") String name, @Param("file") File file);

    @RequestLine("POST /{dir}/{name}")
    @Headers("Content-Type: multipart/form-data")
    FilerPostResult update(@Param("dir") String dir, @Param("name") String name, @Param("file") File file);

    @RequestLine("DELETE /{dir}/{name}")
    void delete(@Param("dir") String dir, @Param("name") String name);

    @RequestLine("GET /{dir}/{name}")
    Response download(@Param("dir") String dir, @Param("name") String name);
}

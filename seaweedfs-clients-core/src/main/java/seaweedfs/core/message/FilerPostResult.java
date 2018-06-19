package seaweedfs.core.message;

import lombok.Data;

import java.io.Serializable;

@Data
public class FilerPostResult implements Serializable {
    private static final long serialVersionUID = 992252084874844015L;
    private String name;
    private Integer size;
    private String fid;
    private String url;
    private String error;

    @Override
    public String toString() {
        return "FilerPostResult{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", fid='" + fid + '\'' +
                ", url='" + url + '\'' +
                ", error='" + error + '\'' +
                '}';
    }
}

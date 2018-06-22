package seaweedfs.core.message;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class FilerPostResult implements Serializable {
    private static final long serialVersionUID = 992252084874844015L;
    private String name;
    private Integer size;
    private String fid;
    private String url;
    private String error;

    public FilerPostResult(String error) {
        this.error = error;
    }

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

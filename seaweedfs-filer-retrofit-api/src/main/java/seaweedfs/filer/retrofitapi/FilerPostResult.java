package seaweedfs.filer.retrofitapi;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class FilerPostResult {
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

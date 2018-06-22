package seaweedfs.core.message;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class ErrorResult implements Serializable {
    private static final long serialVersionUID = 8007459004447372609L;
    private String error;

    public ErrorResult(String error) {
        this.error = error;
    }
}

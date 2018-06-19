package seaweedfs.core.message;

import lombok.Data;

import java.io.Serializable;

@Data
public class ErrorResult implements Serializable {
    private static final long serialVersionUID = 8007459004447372609L;
    private String error;
}

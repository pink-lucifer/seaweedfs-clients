package seaweedfs.spring.boot.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.seaweedfs", ignoreUnknownFields = true)
public class SeaweedfsProperties {
    /**
     * Whether to enable seaweedfs.
     */
    private boolean enabled = true;
}

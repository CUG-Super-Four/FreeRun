package com.freerun.media.config;

import com.freerun.media.enums.Platform;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "freerun.platform")
public class PlatformProperties {
    private Platform file;
    private Platform media;
}

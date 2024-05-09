package com.freerun.pay.third;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "freerun.pay")
public class CommonPayProperties {
    private String notifyHost;
}

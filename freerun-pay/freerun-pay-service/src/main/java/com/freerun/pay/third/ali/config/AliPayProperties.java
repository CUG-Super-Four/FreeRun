package com.freerun.pay.third.ali.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "freerun.pay.ali")
public class AliPayProperties {
    private String protocol = "https";
    private String gatewayHost= "openapi.alipay.com";
    private String signType = "RSA2";
    private String appId;
    private String merchantPrivateKey;
    private String publicKey;
    private String encryptKey;
}

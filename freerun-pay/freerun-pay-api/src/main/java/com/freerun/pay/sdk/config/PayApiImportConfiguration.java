package com.freerun.pay.sdk.config;


import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.freerun.pay.sdk.client")
public class PayApiImportConfiguration {

}
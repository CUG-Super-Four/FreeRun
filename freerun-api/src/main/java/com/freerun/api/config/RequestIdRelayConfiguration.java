package com.freerun.api.config;


import feign.RequestInterceptor;
import org.slf4j.MDC;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.freerun.common.constants.Constant.*;

@Configuration
@EnableFeignClients(basePackages = "com.freerun.api.client")
public class RequestIdRelayConfiguration {

    @Bean
    public RequestInterceptor requestIdInterceptor(){
        return template -> template
                .header(REQUEST_ID_HEADER, MDC.get(REQUEST_ID_HEADER))
                .header(REQUEST_FROM_HEADER, FEIGN_ORIGIN_NAME);
    }
}
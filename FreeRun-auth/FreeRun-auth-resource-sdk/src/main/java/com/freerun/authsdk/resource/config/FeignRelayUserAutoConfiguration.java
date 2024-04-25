package com.freerun.authsdk.resource.config;

import com.freerun.authsdk.resource.interceptors.FeignRelayUserInterceptor;
import feign.Feign;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Feign.class)
public class FeignRelayUserAutoConfiguration {

    @Bean
    public FeignRelayUserInterceptor feignRelayUserInterceptor(){
        return new FeignRelayUserInterceptor();
    }
}

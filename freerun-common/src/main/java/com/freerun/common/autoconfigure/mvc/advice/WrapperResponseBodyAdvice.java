package com.freerun.common.autoconfigure.mvc.advice;

import com.freerun.common.constants.Constant;
import com.freerun.common.domain.R;
import com.freerun.common.utils.WebUtils;
import org.slf4j.MDC;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@RestControllerAdvice
public class WrapperResponseBodyAdvice implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(MethodParameter returnType, @NonNull Class<? extends HttpMessageConverter<?>> converterType) {
        return returnType.getParameterType() != R.class && WebUtils.isGatewayRequest();
    }

    @Override
    public Object beforeBodyWrite(
            Object body, @NonNull MethodParameter returnType, @NonNull MediaType selectedContentType,
            @NonNull Class<? extends HttpMessageConverter<?>> selectedConverterType,
            @NonNull ServerHttpRequest request, @NonNull ServerHttpResponse response) {
        if ("/v2/api-docs".equals(request.getURI().getPath())){
            return body;
        }
        if (body == null) {
            return R.ok().requestId(MDC.get(Constant.REQUEST_ID_HEADER));
        }
        if(body instanceof R){
            return body;
        }
        return R.ok(body).requestId(MDC.get(Constant.REQUEST_ID_HEADER));
    }
}

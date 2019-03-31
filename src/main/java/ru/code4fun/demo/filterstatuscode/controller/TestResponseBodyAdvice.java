package ru.code4fun.demo.filterstatuscode.controller;

import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * Created by: Denis Timofeev
 * Date: 31.03.2019
 */
@ControllerAdvice
public class TestResponseBodyAdvice<T> implements ResponseBodyAdvice<T> {

    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }

    @Override
    public T beforeBodyWrite(T body,
                             MethodParameter returnType,
                             MediaType selectedContentType,
                             Class<? extends HttpMessageConverter<?>> selectedConverterType,
                             ServerHttpRequest request,
                             ServerHttpResponse response) {

        response.setStatusCode(HttpStatus.CREATED);
        return body;
    }
}

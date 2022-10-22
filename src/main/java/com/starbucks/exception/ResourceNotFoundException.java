package com.starbucks.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException;

import java.nio.charset.Charset;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends HttpClientErrorException {

    public ResourceNotFoundException(HttpStatus statusCode, String statusText, byte[] body, Charset responseCharset) {
        super(statusCode, statusText, body, responseCharset);
    }
}

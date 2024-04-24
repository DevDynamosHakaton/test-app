package com.devdynamos.exception;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class DefaultExceptionHandler {
    @ExceptionHandler(WebException.class)
    public ResponseEntity<ExceptionResponse> webException(WebException exception) {
        return exception.toExceptionResponse();
    }
}

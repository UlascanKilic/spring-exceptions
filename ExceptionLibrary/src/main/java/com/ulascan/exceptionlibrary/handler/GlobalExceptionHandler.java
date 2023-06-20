package com.ulascan.exceptionlibrary.handler;

import com.ulascan.exceptionlibrary.exceptions.BaseException;
import com.ulascan.exceptionlibrary.entity.ExceptionEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(BaseException.class)
    public final ResponseEntity<Object> handleException(BaseException exception)
    {
        ExceptionEntity exceptionEntity = new ExceptionEntity(exception.getStatusMessage(),
                exception.getMessage(),
                exception.getStatus(),
                new Date()
               );

        return new ResponseEntity<>(exceptionEntity, exception.getHttpStatus());
    }

}

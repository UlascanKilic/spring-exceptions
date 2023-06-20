package com.ulascan.exceptionlibrary.exceptions;

import com.ulascan.exceptionlibrary.util.GenericStatusCodes;

import org.springframework.http.HttpStatus;

public class ObjectNotValidException extends BaseException{

    private static final String label = HttpStatus.FORBIDDEN.getReasonPhrase();
    private static final HttpStatus httpStatus = HttpStatus.FORBIDDEN;

    public ObjectNotValidException(String exception) {
        super(exception);
    }

    public ObjectNotValidException(String exception, GenericStatusCodes genericStatusCode) {
        super(exception, genericStatusCode, label, httpStatus);
    }
}

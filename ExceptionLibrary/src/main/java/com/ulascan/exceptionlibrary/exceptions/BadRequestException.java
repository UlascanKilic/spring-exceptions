package com.ulascan.exceptionlibrary.exceptions;

import com.ulascan.exceptionlibrary.util.IGenericStatusCodes;
import org.springframework.http.HttpStatus;

public class BadRequestException extends BaseException{

    private static final String label = HttpStatus.BAD_REQUEST.getReasonPhrase();
    private static final HttpStatus httpStatus = HttpStatus.BAD_REQUEST;

    public BadRequestException(String exception) {
        super(exception);
    }

    public BadRequestException(String exception, IGenericStatusCodes genericStatusCode) {
        super(exception, genericStatusCode, label, httpStatus);
    }
}

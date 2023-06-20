package com.ulascan.exceptionlibrary.exceptions;

import com.ulascan.exceptionlibrary.util.IGenericStatusCodes;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class BaseException extends RuntimeException{
    protected  int status;
    protected String statusMessage;
    protected HttpStatus httpStatus;

    public BaseException(String exception)
    {
        super(exception);
    }

    public BaseException(String exception, IGenericStatusCodes genericStatusCode, String statusMessage, HttpStatus httpStatus){
        super(exception);

        status = genericStatusCode.getValue();
        this.statusMessage = statusMessage;
        this.httpStatus = httpStatus;
    }
}

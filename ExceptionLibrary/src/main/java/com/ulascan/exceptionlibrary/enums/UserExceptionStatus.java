package com.ulascan.exceptionlibrary.enums;

import com.ulascan.exceptionlibrary.util.IGenericStatusCodes;

public enum UserExceptionStatus implements IGenericStatusCodes {
    USER_NOT_FOUND("The user is not exists that you are looking for", 3100),
    USER_EMAIL_IN_USE("This email is in use!", 3200);

    private final String message;
    private final int value;

    UserExceptionStatus(String message, int value)
    {
        this.message = message;
        this.value = value;
    }


    @Override
    public int getValue() {
        return value;
    }

    public String getMessage(){
        return message;
    }
}

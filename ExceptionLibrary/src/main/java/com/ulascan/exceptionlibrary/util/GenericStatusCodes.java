package com.ulascan.exceptionlibrary.util;

public enum GenericStatusCodes implements IGenericStatusCodes{
    EDUVERSE_DNS(37),
    EDUVERSE_DB_VIOLATION(38),
    EDUVERSE_NETWORK_FAILED(39)

    ;

    private final int value;

    GenericStatusCodes(int value)
    {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }
}

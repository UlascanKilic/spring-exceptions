package com.ulascan.exceptionlibrary.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class ExceptionEntity {
    private String error;
    private String message;
    private int errorCode;
    private Date date;
}

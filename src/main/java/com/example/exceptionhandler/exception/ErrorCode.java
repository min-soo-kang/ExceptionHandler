package com.example.exceptionhandler.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCode {
    NOT_FOUND(404, "COMMON-ERROR-404", "PAGE NOT FOUND"),
    INTER_SERVER_ERROR(500, "COMMON-ERROR-500", "INTER_SERVER_ERROR"),
    EMPTY_DATA(600, "EMPTY-DATA-ERROR-600", "EMPTY_DATA"),
    ;

    private int status;
    private String errorCode;
    private String msg;

}

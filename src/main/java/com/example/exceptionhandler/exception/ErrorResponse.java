package com.example.exceptionhandler.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {
    private int status;
    private String msg;
    private String code;

    public ErrorResponse(ErrorCode errorCode) {
        this.status = errorCode.getStatus();
        this.msg = errorCode.getMsg();
        this.code = errorCode.getErrorCode();
    }
}

package com.example.exceptionhandler.exception;

import lombok.Getter;

@Getter
public class EmptyException extends RuntimeException{
    private ErrorCode errorCode;

    public EmptyException(String msg, ErrorCode errorCode) {
        super(msg);
        this.errorCode = errorCode;
    }
}

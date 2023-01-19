package com.example.exceptionhandler.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@Slf4j
@RestControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(EmptyException.class)
    public ResponseEntity<ErrorResponse> emptyDataException(EmptyException ex) {
        log.error("Handler EmptyException", ex);
        ErrorResponse errorRespnse = new ErrorResponse(ex.getErrorCode());
        return new ResponseEntity<>(errorRespnse, HttpStatus.valueOf(ex.getErrorCode().getStatus()));
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleException(Exception ex){
        log.error("handleException",ex);
        ErrorResponse response = new ErrorResponse(ErrorCode.INTER_SERVER_ERROR);
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

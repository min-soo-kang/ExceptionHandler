package com.example.exceptionhandler;

import com.example.exceptionhandler.exception.EmptyException;
import com.example.exceptionhandler.exception.ErrorCode;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExceptionHandlerApplicationTests {

    @Test
    void contextLoads() {
        throw new EmptyException("데이터없음", ErrorCode.EMPTY_DATA);
    }

}

package com.dmc.domain.entity.exception;

/**
 * @author xiaobian.chen
 * @version 1.0 2015/11/5
 * This exception class is for DMC parent exception
 */
public class CommonException extends RuntimeException{

    public CommonException() {
    }

    public CommonException(String message) {
        super(message);
    }

    public CommonException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public CommonException(Throwable throwable) {
        super(throwable);
    }
}

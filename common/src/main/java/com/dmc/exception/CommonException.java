package com.dmc.exception;

/**
 * @author xiaobian.chen
 * @version 1.0 2015/11/5
 * @link https://github.com/xiaobianchen/DMC
 *
 * 异常处理
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

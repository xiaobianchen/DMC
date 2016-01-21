package com.dmc.exception;

/**
 * @author xiaobianchen
 * @version 1.0 2016/1/11
 * @link https://github.com/xiaobianchen/DMC
 */
public class DMCException extends CommonException {

    public DMCException() {
    }

    public DMCException(String message) {
        super(message);
    }

    public DMCException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public DMCException(Throwable throwable) {
        super(throwable);
    }


}

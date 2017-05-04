package com.seapeng.testspringboot.exception;

/**
 * Created by zseapeng on 2/5/17.
 */
public class UserException extends RuntimeException {
    private Integer code;

    public UserException(Integer code,String message) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}

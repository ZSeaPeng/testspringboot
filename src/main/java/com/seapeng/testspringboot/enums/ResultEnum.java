package com.seapeng.testspringboot.enums;

/**
 * Created by zseapeng on 2/5/17.
 */
public enum ResultEnum {

    UNKNOW_CODE(-1,"未知错误"),
    SUCCESS_CODE(0,"成功"),

    ;

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

package com.seapeng.testspringboot.utils;

import com.seapeng.testspringboot.model.Result;

/**
 * Created by zseapeng on 2/5/17.
 */
public class ResultUtils {
    public static Result SUCCESS(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("success");
        result.setData(object);
        return result;
    }
    public static Result SUCCESS(){
        return SUCCESS(null);
    }
    public static Result ERROR (Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(null);
        return result;
    }
}

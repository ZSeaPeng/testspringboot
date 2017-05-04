package com.seapeng.testspringboot.handle;

import com.seapeng.testspringboot.exception.UserException;
import com.seapeng.testspringboot.model.Result;
import com.seapeng.testspringboot.utils.ResultUtils;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by zseapeng on 2/5/17.
 */
@RestControllerAdvice
public class ExceptionHandle {
    public final static org.slf4j.Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(Exception.class)
    public Result errorExceptionHandle(Exception e){
        if (e instanceof UserException){
            UserException userException = (UserException) e;
            return ResultUtils.ERROR(userException.getCode(),userException.getMessage());
        }else {
            logger.info("[系统错误]{}",e);
            return ResultUtils.ERROR(-1, "未知错误");
        }
    }
}

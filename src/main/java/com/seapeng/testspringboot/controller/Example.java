package com.seapeng.testspringboot.controller;

import com.seapeng.testspringboot.model.Result;
import com.seapeng.testspringboot.model.TUser;
import com.seapeng.testspringboot.service.UserService;
import com.seapeng.testspringboot.utils.ResultUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zseapeng on 12/4/17.
 */
@RestController //等同于@Controller和@RequestBody
@Api(value = "Example Controller", description = "Controller例子")
public class Example {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "首页方法", notes = "首页", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "hello world";
    }

    @ApiOperation(value = "通过ID获取用户信息", notes = "通过ID获取用户信息", httpMethod = "GET")
    @RequestMapping(value = "/userid/{id}", method = RequestMethod.GET)
    public Result<TUser> getUserInfo(@PathVariable int id) throws Exception{


        return ResultUtils.SUCCESS(userService.getUserName(id));
    }
    /*
     *@RequestParm(value="",required=false,defaultValue="")  required:是否必须有参数, defaultValue:默认值
     */
    @GetMapping(value = "/getage/{id}")
    public void getAge(@PathVariable("id") int id) throws Exception {
        userService.getAge(id);
    }
}

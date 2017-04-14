package com.seapeng.testspringboot.test;

import com.seapeng.testspringboot.model.TUser;
import com.seapeng.testspringboot.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zseapeng on 12/4/17.
 */
@RestController
@Api(value = "Example Controller",description = "Controller例子")
public class Example {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "首页方法",notes = "首页",httpMethod = "GET",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "hello world";
    }

    @ApiOperation(value = "通过ID获取用户信息",notes = "通过ID获取用户信息",httpMethod = "GET")
    @RequestMapping(value = "/userid/{id}",method = RequestMethod.GET)
    public TUser getUserInfo(@PathVariable int id){
        return userService.getUserName(id);
    }

}

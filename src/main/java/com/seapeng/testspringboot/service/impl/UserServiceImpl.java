package com.seapeng.testspringboot.service.impl;

import com.seapeng.testspringboot.dao.TUserMapper;
import com.seapeng.testspringboot.exception.UserException;
import com.seapeng.testspringboot.model.TUser;
import com.seapeng.testspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zseapeng on 13/4/17.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired()
    private TUserMapper tUserMapper;

    @Override
    public TUser getUserName(int id) {
        TUser user = tUserMapper.selectByPrimaryKey(id);
        return user;
    }

    @Override
    public void getAge(int id) throws Exception{
        TUser user = tUserMapper.selectByPrimaryKey(id);
        int age = user.getAge();
        System.out.println("age==>"+age);
        if (age<10){
            throw new UserException(100,"年龄为 "+age+ " 太小");
        }else if (age>15){
            throw new UserException(101,"----");
        }
    }

    @Transactional
    public int updata(TUser user) {
        return tUserMapper.updateByPrimaryKey(user);
    }
}

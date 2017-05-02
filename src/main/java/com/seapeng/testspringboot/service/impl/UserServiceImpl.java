package com.seapeng.testspringboot.service.impl;

import com.seapeng.testspringboot.dao.TUserMapper;
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
        return tUserMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public int updata(TUser user){
        return tUserMapper.updateByPrimaryKey(user);
    }
}

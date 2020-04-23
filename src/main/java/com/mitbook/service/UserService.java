package com.mitbook.service;

import com.mitbook.entity.User;
import com.mitbook.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author pengzhengfa
 */
@Component
@Transactional(rollbackFor = Exception.class)
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryUser(){
        User user = userMapper.selectAll();
        return user;
    }
}

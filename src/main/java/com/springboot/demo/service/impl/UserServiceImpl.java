package com.springboot.demo.service.impl;


import com.springboot.demo.data.User;
import com.springboot.demo.mapper.UserMapper;
import com.springboot.demo.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements Userservice {
    @Autowired
    private UserMapper userMapper;
    @Override
    public String login(String name, String password) {
        return userMapper.login(name, password);
    }

    @Override
    public List<Map> getList() {
        return userMapper.getList();
    }
}

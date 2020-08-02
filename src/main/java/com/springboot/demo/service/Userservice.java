package com.springboot.demo.service;

import com.springboot.demo.data.User;
import com.springboot.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface Userservice {

    String login(String name,String password);
    List<Map> getList();
}

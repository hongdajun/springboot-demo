package com.springboot.demo.controller;

import com.springboot.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    /**
     * 用户列表方法
     * @return
     */
    @RequestMapping("/list")
    public Object list(){
        List<Map> list = userService.getList();
        return list;
    }

}

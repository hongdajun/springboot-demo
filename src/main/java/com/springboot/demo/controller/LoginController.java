package com.springboot.demo.controller;

import com.springboot.demo.service.Userservice;
import com.springboot.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@EnableAutoConfiguration
public class LoginController
{
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/userlogin", method = { RequestMethod.POST, RequestMethod.GET })
    public String userlogin()
    {
        return "login/login";

    }

    @RequestMapping(value = "loginPage", method = { RequestMethod.POST, RequestMethod.GET })
    public String loginCon(HttpServletRequest request, HttpServletResponse response)
    {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String tname = userService.login(name, password);
        request.getSession().setAttribute("tname", tname);
        if (tname == null)
        {
            return "redirect:/userlogin";
        }
        else
        {
            return "redirect:/indexLogin";
        }
    }

    @RequestMapping(value = "/indexLogin", method = { RequestMethod.POST, RequestMethod.GET })
    public String loginindex()
    {
        return "/login/test";
    }

    @RequestMapping(value = "/selectPage", method = { RequestMethod.POST, RequestMethod.GET })
    public String selectPage()
    {
        return "/main/selectIndex";
    }
}

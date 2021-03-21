package com.yya.controller;

import com.yya.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: yya
 * @date: 2021/2/26
 * @Description: com.yya.controller
 * @version: 1.0
 */
@Controller
public class UserControllerImpl implements UserController {


    @Override
    @RequestMapping(value = "/user/register.action")
    public ModelAndView UserRegister(User user) {
        System.out.println("666");

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/login.html");
        return modelAndView;
    }
}

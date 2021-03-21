package com.yya.controller;

import com.yya.pojo.User;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: yya
 * @date: 2021/2/26
 * @Description: com.yya.controller
 * @version: 1.0
 */

public interface UserController {

    //用户注册
    public ModelAndView UserRegister(User user);
}

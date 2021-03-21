package com.yya.mapper;

import com.yya.pojo.User;

/**
 * @Author: yya
 * @date: 2021/2/25
 * @Description: com.yya.mapper
 * @version: 1.0
 */
public interface UserMapper {

    public User findUserById(Integer id);

}

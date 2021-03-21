package com.yya.pojo;


import java.io.Serializable;
import java.util.Date;

/**
 * @Author: yya
 * @date: 2021/2/25
 * @Description: com.yya.bean
 * @version: 1.0
 */

//Serializable 序列化 可写入硬盘
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer user_id;
    private String user_name;
    private String user_photo;  //图像地址
    private String user_register_time; //注册时间
    private String user_bir;  //生日
    private Integer user_age;
    private String user_tell;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_photo() {
        return user_photo;
    }

    public void setUser_photo(String user_photo) {
        this.user_photo = user_photo;
    }

    public String getUser_register_time() {
        return user_register_time;
    }

    public void setUser_register_time(String user_register_time) {
        this.user_register_time = user_register_time;
    }

    public String getUser_bir() {
        return user_bir;
    }

    public void setUser_bir(String user_bir) {
        this.user_bir = user_bir;
    }

    public Integer getUser_age() {
        return user_age;
    }

    public void setUser_age(Integer user_age) {
        this.user_age = user_age;
    }

    public String getUser_tell() {
        return user_tell;
    }

    public void setUser_tell(String user_tell) {
        this.user_tell = user_tell;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                '}';
    }
}

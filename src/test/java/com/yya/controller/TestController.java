package com.yya.controller;

import com.yya.mapper.UserMapper;
import com.yya.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.io.InputStream;

/**
 * @Author: yya
 * @date: 2021/2/25
 * @Description: com.yya.controller
 * @version: 1.0
 */

@Component
public class TestController {

    @Test
    public  void test2(){

        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper bean = ca.getBean(UserMapper.class);
        User user = bean.findUserById(1);
        System.out.println(user);
//        SqlSession sqlSession = sf.openSession();
//
//
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//
//        User userById = mapper.findUserById(1);
//
//        System.out.println(userById);
    }
    public void Test1() throws Exception{
        //加载配置文件
        String resouce = "sqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(resouce);

        //创建sessionFactory
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
        //创建session
        SqlSession sqlSession = build.openSession();

        //执行sql语句
//        User user = sqlSession.selectOne("com.yya.pojo.UserMapper.findUserById", 1);

//        System.out.println(user);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User userById = mapper.findUserById(1);

        System.out.println(userById);

    }

}

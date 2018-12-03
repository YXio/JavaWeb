package com.yibear;

import com.yibear.controller.TestController;
import com.yibear.dao.TestDao;
import com.yibear.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-mybatis.xml");
        TestDao dao = context.getBean("testDao",TestDao.class);
        System.out.println(dao.selectUserById(1));
    }
}

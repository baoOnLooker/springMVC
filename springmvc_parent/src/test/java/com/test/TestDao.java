package com.test;

import com.test.dao.UserDao;
import com.test.entity.User;
import com.test.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDao {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/test/spring/application.xml");

        UserDao userDao = (UserDao) context.getBean("userDao");

        User user = new User();

        user.setId(1);

        //User user1 = userDao.queryOne(user);

        //System.out.println(user1);

        UserService userService = (UserService) context.getBean("userService");

        userService.test(user);

    }


}

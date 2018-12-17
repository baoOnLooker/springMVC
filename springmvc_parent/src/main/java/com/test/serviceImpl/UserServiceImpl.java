package com.test.serviceImpl;

import com.test.dao.UserDao;
import com.test.entity.User;
import com.test.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public void test(User user) {

        System.out.println(userDao);

        User user1 = userDao.queryOne(user);

        System.out.println(user1);

    }
}

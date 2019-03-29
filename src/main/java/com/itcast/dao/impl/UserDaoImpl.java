package com.itcast.dao.impl;

import com.itcast.dao.UserDao;
import com.itcast.meat.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser(User user) {
        System.out.println("添加一个用户：" + user.getName());
    }
}

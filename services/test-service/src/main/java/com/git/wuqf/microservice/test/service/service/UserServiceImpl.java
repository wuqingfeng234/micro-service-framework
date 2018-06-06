package com.git.wuqf.microservice.test.service.service;

import com.git.wuqf.microservice.test.service.entity.User;
import com.git.wuqf.microservice.test.service.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUserInfo() {
        return userMapper.findUserInfo();
    }


    public void insert(User user) {
        userMapper.addUserInfo(user);

    }
}
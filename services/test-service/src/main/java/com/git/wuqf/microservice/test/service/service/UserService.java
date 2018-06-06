package com.git.wuqf.microservice.test.service.service;

import com.git.wuqf.microservice.test.service.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getUserInfo();

    public void insert(User user);
}
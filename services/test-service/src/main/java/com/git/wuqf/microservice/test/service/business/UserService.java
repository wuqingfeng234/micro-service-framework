package com.git.wuqf.microservice.test.service.business;

import com.git.wuqf.microservice.test.service.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getUserInfo();

    public void insert(User user);
}
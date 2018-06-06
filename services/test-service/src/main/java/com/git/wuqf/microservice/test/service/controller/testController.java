package com.git.wuqf.microservice.test.service.controller;

import com.git.wuqf.microservice.test.service.business.UserService;
import com.git.wuqf.microservice.test.service.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RefreshScope
@RestController
public class testController {

    @Value("${from}")
    private String from;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
    public String testController() {
        return "hello world";
    }

    @RequestMapping(value = "/nativeConfig", method = RequestMethod.GET)
    public String testNativeConfig() {
        return from;
    }


    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public Integer addUser(@RequestBody User user) {
        userService.insert(user);
        return 0;
    }

    @RequestMapping(value = "/getUsers", method = RequestMethod.GET)
    public List<User> getUser() {
        return userService.getUserInfo();
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}

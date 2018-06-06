package com.git.wuqf.microservice.user.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/user")
public class testController {

    @Value("${from}")
    private String from;

    @RequestMapping(value = "/helloWorld" ,method = RequestMethod.GET)
    public String testController(){
        return "hello world";
    }

    @RequestMapping(value = "/nativeConfig" ,method = RequestMethod.GET)
    public String testNativeConfig(){
        return from;
    }


    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}

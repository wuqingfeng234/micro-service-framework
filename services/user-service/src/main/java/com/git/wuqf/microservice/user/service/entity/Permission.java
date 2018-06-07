package com.git.wuqf.microservice.user.service.entity;

import java.io.Serializable;

public class Permission implements Serializable {

    private Long id;//
    private String url;//url地址
    private String name;//url描述

    public Long getId() {
        return id;
    }

    /**
     * getting setting auto  generate
     */
    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //generate toString method
    @Override
    public String toString() {
        return "Permission[id=" + id
                + ",url=" + url
                + ",name=" + name + "]";
    }


}

package com.git.wuqf.microservice.user.service.entity;

import java.io.Serializable;


public class Role implements Serializable {
    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 1493049839167L;

    private Long id;//
    private String name;//角色名称
    private String type;//角色类型


    /**
     * getting setting auto  generate
     */
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }


    //generate toString method
    @Override
    public String toString() {
        return "Role[id=" + id
                + ",name=" + name
                + ",type=" + type + "]";
    }


}

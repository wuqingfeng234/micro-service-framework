package com.git.wuqf.microservice.user.service.entity;

import java.io.Serializable;


public class RolePermission implements Serializable {
    private static final long serialVersionUID = 1493049839167L;

    private Long rid;//角色ID
    private Long pid;//权限ID


    /**
     * getting setting auto  generate
     */
    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Long getRid() {
        return rid;
    }


    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Long getPid() {
        return pid;
    }


    //generate toString method
    @Override
    public String toString() {
        return "RolePermission[rid=" + rid
                + ",pid=" + pid + "]";
    }


}

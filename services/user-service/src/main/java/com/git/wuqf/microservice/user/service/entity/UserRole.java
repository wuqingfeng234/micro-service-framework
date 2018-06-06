package com.git.wuqf.microservice.user.service.entity;

import java.io.Serializable;

public class UserRole implements Serializable {
    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 1493049839167L;

    private Long uid;//用户ID
    private Long rid;//角色ID


    /**
     * getting setting auto  generate
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getUid() {
        return uid;
    }


    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Long getRid() {
        return rid;
    }


    //generate toString method
    @Override
    public String toString() {
        return "UserRole[uid=" + uid
                + ",rid=" + rid + "]";
    }


}

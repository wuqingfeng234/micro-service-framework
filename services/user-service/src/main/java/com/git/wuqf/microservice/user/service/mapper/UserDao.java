package com.git.wuqf.microservice.user.service.mapper;

import com.git.wuqf.microservice.user.service.common.BaseDao;
import com.git.wuqf.microservice.user.service.entity.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserDao extends BaseDao<User, Long> {

    /**
     * 增加对象
     *
     * @param name
     */
    public User findByName(String name);
}

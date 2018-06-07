package com.git.wuqf.microservice.user.service.mapper;

import com.git.wuqf.microservice.user.service.common.BaseDao;
import com.git.wuqf.microservice.user.service.entity.Permission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface PermissionDao extends BaseDao<Permission, Long> {


    /**
     * 根据用户id获取用户权限
     *
     * @param id
     */
    List<Permission> findPermissionByUid(Long id);
}

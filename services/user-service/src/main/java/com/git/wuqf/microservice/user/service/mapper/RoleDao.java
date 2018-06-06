package com.git.wuqf.microservice.user.service.mapper;


import com.git.wuqf.microservice.user.service.common.BaseDao;
import com.git.wuqf.microservice.user.service.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface RoleDao extends BaseDao<Role, Long> {

    /**
     * 根据用户ID获取该用户所在组的角色权限
     *
     * @param obj
     */
    public List<Role> findRoleByUid(Long obj);
}

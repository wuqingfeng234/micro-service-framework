package com.git.wuqf.microservice.user.service.mapper;

import com.git.wuqf.microservice.user.service.common.BaseDao;
import com.git.wuqf.microservice.user.service.entity.RolePermission;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface RolePermissionDao extends BaseDao<RolePermission, Long> {

    /**
     * 增加对象
     * @param obj
     */
    //public void add(SysMessageTep	 obj);
}

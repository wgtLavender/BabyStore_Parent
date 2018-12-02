package com.babystore.admin.mapper;

import com.babystore.admin.pojo.RolesPermissions;

public interface RolesPermissionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RolesPermissions record);

    int insertSelective(RolesPermissions record);

    RolesPermissions selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RolesPermissions record);

    int updateByPrimaryKey(RolesPermissions record);
}
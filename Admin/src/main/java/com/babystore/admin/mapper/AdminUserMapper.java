package com.babystore.admin.mapper;

import com.babystore.admin.pojo.AdminUser;

public interface AdminUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminUser record);

    int insertSelective(AdminUser record);

    AdminUser selectByAdminUser(AdminUser adminUser);

    int updateByPrimaryKeySelective(AdminUser record);

    int updateByPrimaryKey(AdminUser record);
    AdminUser selectByName(String username);
}
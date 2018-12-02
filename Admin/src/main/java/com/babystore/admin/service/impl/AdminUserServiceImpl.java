package com.babystore.admin.service.impl;

import com.babystore.admin.common.RUtil;
import com.babystore.admin.mapper.AdminUserMapper;
import com.babystore.admin.pojo.AdminUser;
import com.babystore.admin.resultvo.vo.R;
import com.babystore.admin.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: BabyStore_Parent
 * @author: Administrator
 * @create: 2018-11-30 11:48
 **/

public class AdminUserServiceImpl implements AdminUserService {
    @Autowired
    private AdminUserMapper adminUserMapper;

    @Override
    public AdminUser login(AdminUser adminUser) {
        AdminUser admin = adminUserMapper.selectByAdminUser(adminUser);
        if (admin!=null) {
            return admin;
        } else {
            return null;
        }

    }

    @Override
    public R addAdmin(AdminUser adminUser) {
        return RUtil.setRes(adminUserMapper.insertSelective(adminUser));
    }

    @Override
    public R checkAdmin(String username) {
        AdminUser adminUser = adminUserMapper.selectByName(username);
        if (adminUser!=null){
            return RUtil.setOK("用户已存在");
        }
        return RUtil.setERROR("用户名可以使用~~~");
    }
}


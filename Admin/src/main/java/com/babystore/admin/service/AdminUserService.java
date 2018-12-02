package com.babystore.admin.service;

import com.babystore.admin.pojo.AdminUser;
import com.babystore.admin.resultvo.vo.R;

/**
 * @program: BabyStore_Parent
 * @author: Administrator
 * @create: 2018-11-30 11:31
 **/

public interface AdminUserService {
    AdminUser login(AdminUser adminUser);
    R addAdmin(AdminUser adminUser);
    R checkAdmin(String username);
}


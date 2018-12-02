package com.babystore.service.user;

import com.babystore.common.vo.ResultBean;
import com.babystore.domain.user.Users;

/**
 * @program: BabyStore_Parent
 * @author: Administrator
 * @create: 2018-11-28 20:43
 **/

public interface UserService {
    ResultBean add(Users users,String ip);
    ResultBean modify(Users users);
}


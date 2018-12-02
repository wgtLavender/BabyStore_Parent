package com.babystore.app.user;

import com.babystore.common.vo.ResultBean;
import com.babystore.domain.user.Users;
import com.babystore.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
/**
 * @program: BabyStore_Parent
 * @author: Administrator
 * @create: 2018-11-28 22:41
 **/
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("userAdd.do")
    public ResultBean add(Users users,HttpServletRequest request) {
        return userService.add(users,request.getRemoteAddr());
    }

    @PostMapping("userModify.do")
    public ResultBean modify(Users users) {
        return userService.modify(users);
    }
}


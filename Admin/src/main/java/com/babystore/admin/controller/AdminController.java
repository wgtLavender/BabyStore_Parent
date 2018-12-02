package com.babystore.admin.controller;

import com.babystore.admin.common.RUtil;
import com.babystore.admin.pojo.AdminUser;
import com.babystore.admin.resultvo.vo.R;
import com.babystore.admin.service.AdminUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: BabyStore_Parent
 * @author: Administrator
 * @create: 2018-11-30 11:29
 **/
@RestController
public class AdminController {
    @Autowired
    private AdminUserService adminUserService;

    @PostMapping("/adminLogin.do")
    public R login(AdminUser adminUser, String rm) {
        AdminUser admin = adminUserService.login(adminUser);
        if (admin != null) {
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(adminUser.getUsername(), adminUser.getPassword());
            if (rm != null && rm.length() > 0) {
                token.setRememberMe(true);
            }
            System.out.println("登录：" + admin.getId());
            subject.getSession().setAttribute("admin", admin);
            subject.login(token);
            return RUtil.setOK("登录成功");
        } else {
            return RUtil.setERROR("用户名或密码错误");
        }
    }
    //新增用户
    @PostMapping("/adminsave.do")
    public R save(AdminUser admin){
        return adminUserService.addAdmin(admin);
    }
    //验证是否存在用户名
    @RequestMapping("/admincheck.do")
    public R check(String name)  {
        return adminUserService.checkAdmin(name);
    }
    //查询 分页
    @RequestMapping("/adminpage.do")
    public PageVo<Admin> list(int page, int limit){
        return adminService.queryByPage(page,limit);
    }
}


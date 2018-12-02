package com.babystore.admin.shiro;

import java.util.HashSet;
import java.util.List;

import com.babystore.admin.mapper.AdminUserMapper;
import com.babystore.admin.pojo.AdminUser;
import com.babystore.admin.service.PermissionService;
import com.babystore.admin.service.RoleService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;



public class ShiroRealm extends AuthorizingRealm{
	@Autowired
	private AdminUserMapper adminUserMapper;
	@Autowired
	private RoleService rservice;
	@Autowired
	private PermissionService pservice;
//授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		AdminUser user = (AdminUser) arg0.getPrimaryPrincipal();
		System.out.println(user.getId());
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//		List<String> roles = rservice.selectRoles(user.getId()+"");
		List<String> pers = pservice.selectPermissions(user.getId());
//		HashSet<String> set = new HashSet<>(roles);
//		HashSet<String> set2 = new HashSet<>(perssions);
//		info.setStringPermissions(set2);
		info.addStringPermissions(pers);
		System.out.println(pers);
//		System.out.println(set);
//		info.setRoles(set);
//		System.out.println(roles);
		return info;
	}
//验证信息
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
		UsernamePasswordToken token=(UsernamePasswordToken)arg0;
		// 注入第二参数是从数据库中查询出来的正确的密码，shiro会自动判断，如果此密码和刚才传递的密码不知会上抛异常
        if (token.getUsername() !=null) {
            SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(token.getUsername(), token.getPassword(), getName());
            return info;
        }
		return null;
	}

}

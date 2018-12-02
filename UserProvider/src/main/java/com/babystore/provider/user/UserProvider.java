package com.babystore.provider.user;

import com.babystore.common.constant.Constants;
import com.babystore.common.utils.ResultUtil;
import com.babystore.common.vo.ResultBean;
import com.babystore.common.vo.ResultPageBean;
import com.babystore.domain.user.Logs;
import com.babystore.domain.user.Users;
import com.babystore.mapper.user.LogsMapper;
import com.babystore.mapper.user.UsersMapper;
import com.babystore.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: BabyStore_Parent
 * @author: Administrator
 * @create: 2018-11-28 20:48
 **/
@Service("userprovider")
public class UserProvider implements UserService {
@Autowired
private UsersMapper usersMapper;
@Autowired
private LogsMapper logsMapper;
@Override
    public ResultBean add(Users users,String ip) {
ResultBean resultBean = ResultUtil.expUtil("用户注册", usersMapper.insertSelective(users));
    Logs logs = new Logs();
    logs.setContent(users.getNickname() +"完成注册");
    logs.setUid(users.getId());
    logs.setIp(ip);
    logsMapper.insertSelective(logs);
    return resultBean;
    }
    @Override
    public ResultBean modify(Users users) {
        return ResultUtil.expUtil("用户更改", usersMapper.updateByPrimaryKeySelective(users));
    }
}


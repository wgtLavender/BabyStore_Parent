package com.babystore.mapper.user;

import com.babystore.domain.user.Users;

public interface UsersMapper {

    Users selectByName(String name);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Users record);


}
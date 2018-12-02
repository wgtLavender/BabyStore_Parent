package com.babystore.mapper.user;

import com.babystore.domain.user.Logs;

import java.util.List;

public interface LogsMapper {



    List<Logs> selectAll();
    int insertSelective(Logs record);

    Logs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Logs record);


}
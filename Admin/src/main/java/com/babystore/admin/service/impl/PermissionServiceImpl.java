package com.babystore.admin.service.impl;

import com.babystore.admin.mapper.PermissionsMapper;
import com.babystore.admin.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: BabyStore_Parent
 * @author: Administrator
 * @create: 2018-11-30 19:38
 **/
@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionsMapper permissionsMapper;
    @Override
    public List<String> selectPermissions(Integer id) {
        return permissionsMapper.selectPerByAid(id);
    }
}


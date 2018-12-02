package com.babystore.admin.service;

import java.util.List;

public interface PermissionService {
    List<String> selectPermissions(Integer id);
}

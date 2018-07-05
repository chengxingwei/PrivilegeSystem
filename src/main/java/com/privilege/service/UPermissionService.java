package com.privilege.service;

import com.privilege.bo.UPermissionBo;
import com.privilege.model.UPermission;

import java.util.List;
import java.util.Map;


public interface UPermissionService {
    List<UPermission> findPermissionByUserId(Long userId);

    List<UPermission> findAll(UPermissionBo permissionBo);

    Map<String,Object> findMapByPage(UPermission uPermission, Integer pageNum, Integer pageSize,Integer draw);
}

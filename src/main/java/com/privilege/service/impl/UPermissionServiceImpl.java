package com.privilege.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.privilege.bo.UPermissionBo;
import com.privilege.mapper.UPermissionMapper;
import com.privilege.model.UPermission;
import com.privilege.service.UPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(value = "permissionService")
public class UPermissionServiceImpl implements UPermissionService {

    @Autowired
    private UPermissionMapper permissionMapper;

    @Override
    public List<UPermission> findPermissionByUserId(Long userId) {
        return permissionMapper.findPermissionByUserId(userId);
    }

    @Override
    public List<UPermission> findAll(UPermissionBo permissionBo) {
        return permissionMapper.findAll(permissionBo);
    }

    @Override
    public Map<String, Object> findMapByPage(UPermission permissionBo, Integer pageNum, Integer pageSize,Integer draw) {
        Map<String,Object> result = new HashMap<>();
        PageHelper.startPage(pageNum,pageSize);
        List<UPermission> permissions = permissionMapper.findAll(permissionBo);
        result.put("data",permissions);
        PageInfo pageInfo  = new PageInfo(permissions,pageSize);
        result.put("draw",draw);
        result.put("recordsTotal",pageInfo.getTotal());
        result.put("recordsFiltered",pageInfo.getTotal());
        return result;
    }
}

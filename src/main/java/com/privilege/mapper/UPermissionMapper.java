package com.privilege.mapper;

import com.privilege.bo.UPermissionBo;
import com.privilege.model.UPermission;
import java.util.List;

public interface UPermissionMapper {
	//根据用户ID获取权限的Set集合
	List<UPermission> findPermissionByUserId(Long id);

	List<UPermission> findAll(UPermission uPermission);

	Integer findCount(UPermission permission);
}
package br.order.service;

import java.util.List;

import br.order.vo.UserPermissionVo;

public interface UserPermissionService {
	List<UserPermissionVo> getUserPermission(Long userId);
}

package br.order.service;

import java.util.List;

import br.order.pojo.BrRole;
import br.order.pojo.BrRolePermission;
import br.order.pojo.BrUser;
import br.order.pojo.permission.PermissionResult;
import br.order.pojo.permission.RoleResult;
import br.order.vo.BrRoleVo;
import br.order.vo.PermissionVo;

public interface RoleManageService {

	// 查询所有角色
	RoleResult getListBrRole(Integer page, Integer rows);

	BrRole getBrRoleByRoleId(Long id);

	int addBrRole(BrRole brRole);

	int updateBrRoleByRoleId(BrRole brRole);

	int insertUserRole(List<BrRolePermission> brRolePermission);

	List<PermissionResult> getRolePermissionById(Long roleId);

	int updategetRolePermission(List<BrRolePermission> rolePermissonList);

	List<PermissionVo> getPermissionAndOperationByIdAndOpen(Long roleId);

	int savePermission(Long roleId, List<Long> firstIndex, List<Long> opeIndex,BrUser brUser);
	
	public List<BrRoleVo> getRoleListByUserId(Long userId);


}

package br.order.service;

import java.util.List;

import br.order.pojo.BrOperation;
import br.order.pojo.BrPermission;
import br.order.pojo.BrRolePermission;
import br.order.pojo.permission.PermissionResult;
import br.order.vo.UserPermissionVo;

public interface RolePermissionService {

	int insertPermission(BrPermission brPermission);

	int deletePermissionById(Long permissionId);

	int updatePermissionById(BrPermission brPermission);

	List<PermissionResult> getPermissionList();

	List<BrPermission> getMenuList();

	List<BrOperation> getBrOperationList(Long permissionId);

	BrPermission getBrPermissionById(Long id);

	int addBrOperationByPermissionId(BrOperation brOperation);

	int updateBrOperationById(BrOperation operationId);

	BrOperation selectBrOperationById(Long operationId);

	List<BrOperation> getBrOperationListByIdAndOpen(Long permissionId);

	List<UserPermissionVo> getPermissionListByRoleId(List<Long> rolelist);

	List<BrRolePermission> getRolePermissionsByRoleId(List<Long> rolelist);

	

	
}

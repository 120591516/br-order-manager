package br.order.mapper.self;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import br.order.pojo.BrRolePermission;
import br.order.pojo.permission.PermissionResult;
import br.order.vo.OperationVo;
import br.order.vo.PermissionVo;

public interface BrRolePermissionSelfMapper {


	int insertRolePermission(List<BrRolePermission> permission);

	List<PermissionResult> selectAllPermission();
	
	List<PermissionResult> selectPermissionByRoleId(Long id);

	List<PermissionVo> getPermissionListAndOpen();

	List<PermissionVo> getPermissionListByRoleId(Long roleId);

	List<OperationVo> getBrOperationListByPermissionId(Long permissionId);

	int insertPermission(@Param("roleId")Long roleId,@Param("firstIndex") List firstIndex);

	int insertTwoPermission(@Param("roleId")Long roleId,@Param("secIndex") List secIndex);
	
}

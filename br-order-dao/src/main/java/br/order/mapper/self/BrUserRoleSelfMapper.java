package br.order.mapper.self;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import br.order.pojo.BrUserRole;
import br.order.pojo.permission.RoleVo;
import br.order.vo.UserPermissionVo;
import br.order.vo.UserRoleVo;

public interface BrUserRoleSelfMapper {

	List<UserPermissionVo> getUserPermission(Long userId);

	int insertUserRole(@Param("brUserRoles")List<BrUserRole> brUserRoles);

	UserRoleVo getUserRoleById(Long userId);

	List<UserRoleVo> getUserVoByPage();

	List<RoleVo> getAllRoles();

	List<RoleVo> getRolesByUserId(Long userId);

}

package br.order.service;

import java.util.List;

import com.github.pagehelper.PageInfo;

import br.order.pojo.BrUser;
import br.order.pojo.BrUserRole;
import br.order.pojo.permission.RoleVo;
import br.order.vo.UserRoleVo;

public interface UserManageService {

	PageInfo<UserRoleVo> getUserByPage(Integer page, Integer rows);
	
	BrUser getUserByUserName(String userName);
	
	BrUser login(String userName, String password);

	int insertBrUser(BrUser brUser);

	int updateBrUser(BrUser brUser);

	int insertUserRole(String strRolesId,Long userId);

	int updateUserRole(String strRolesId,Long userId);

	UserRoleVo getUserRoleById(Long userId);

	BrUser getBrUserById(Long userId);

	int getCountByUserName(String userName, Long userId);

	List<RoleVo> getRolesByUserId(Long userId);

}

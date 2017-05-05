package br.order.vo;

import java.util.ArrayList;
import java.util.List;

import br.order.pojo.BrUser;

public class BrUserVo extends BrUser {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<BrRoleVo> roles = new ArrayList<BrRoleVo>();
	private List<UserPermissionVo> userPermissionVos;

	public List<BrRoleVo> getRoles() {
		return roles;
	}

	public void setRoles(List<BrRoleVo> roles) {
		this.roles = roles;
	}

	public List<UserPermissionVo> getUserPermissionVos() {
		return userPermissionVos;
	}

	public void setUserPermissionVos(List<UserPermissionVo> userPermissionVos) {
		this.userPermissionVos = userPermissionVos;
	}
	
}

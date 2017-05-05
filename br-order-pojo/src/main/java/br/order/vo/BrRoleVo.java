package br.order.vo;

import java.util.ArrayList;
import java.util.List;

import br.order.pojo.BrRole;

public class BrRoleVo extends BrRole {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<PermissionVo> permissionList = new ArrayList<PermissionVo>();

	public List<PermissionVo> getPermissionList() {
		return permissionList;
	}

	public void setPermissionList(List<PermissionVo> permissionList) {
		this.permissionList = permissionList;
	}
	
	
}

package br.order.vo;

import java.util.ArrayList;
import java.util.List;

import br.order.pojo.BrUser;

public class UserRoleVo extends BrUser {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String rolesForm = "";
	private List<BrRoleVo> roles = new ArrayList<BrRoleVo>();

	public List<BrRoleVo> getRoles() {
		return roles;
	}

	public void setRoles(List<BrRoleVo> roles) {
		this.roles = roles;
	}

	public String getRolesForm() {
		return rolesForm;
	}

	public void setRolesForm(String rolesForm) {
		this.rolesForm = rolesForm;
	}

}

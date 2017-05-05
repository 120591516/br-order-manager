package br.order.vo;

import java.util.List;

import br.order.pojo.BrPermission;
import br.order.pojo.BrRolePermission;

public class RolePermissionVo extends BrRolePermission {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String roleName;

    private String roleDescribe;

    private List<BrPermission> permissions;


	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDescribe() {
		return roleDescribe;
	}

	public void setRoleDescribe(String roleDescribe) {
		this.roleDescribe = roleDescribe;
	}


	public List<BrPermission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<BrPermission> permissions) {
		this.permissions = permissions;
	}
    
    

}

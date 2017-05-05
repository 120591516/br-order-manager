package br.order.vo;

import java.util.ArrayList;
import java.util.List;

import br.order.pojo.BrPermission;

public class PermissionVo extends BrPermission {

	private List<OperationVo> list;

	// 是否选中
	private Boolean permissionFlag;

	// 子节点
	private List<PermissionVo> childrens = new ArrayList<PermissionVo>();

	public List<PermissionVo> getChildrens() {
		return childrens;
	}

	public void setChildrens(List<PermissionVo> childrens) {
		this.childrens = childrens;
	}

	public List<OperationVo> getList() {
		return list;
	}

	public void setList(List<OperationVo> list) {
		this.list = list;
	}

	public Boolean getPermissionFlag() {
		return permissionFlag;
	}

	public void setPermissionFlag(Boolean permissionFlag) {
		this.permissionFlag = permissionFlag;
	}

}

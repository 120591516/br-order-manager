package br.order.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.order.pojo.BrPermission;

public class UserPermissionVo extends BrPermission implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<BrPermission> childrens = new ArrayList<BrPermission>();
	private List<BrOperationVo> operationList = new ArrayList<BrOperationVo>();

	
	
	public List<BrOperationVo> getOperationList() {
		return operationList;
	}

	public void setOperationList(List<BrOperationVo> operationList) {
		this.operationList = operationList;
	}

	public List<BrPermission> getChildrens() {
		return childrens;
	}

	public void setChildrens(List<BrPermission> childrens) {
		this.childrens = childrens;
	}

}

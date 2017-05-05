package br.order.pojo.permission;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.order.pojo.BrOperation;

public class PermissionResult implements Serializable {

	private Long id;// id

	private Integer pId;// 父Id

	private String name;// 权限名称

	private boolean checked;// 是否被选中？

	private List<BrOperation> operationList = new ArrayList<BrOperation>();

	public List<BrOperation> getOperationList() {
		return operationList;
	}

	public void setOperationList(List<BrOperation> operationList) {
		this.operationList = operationList;
	}

	private List<PermissionResult> children = new ArrayList<PermissionResult>(); // 子节点

	public List<PermissionResult> getChildren() {
		return children;
	}

	public void setChildren(List<PermissionResult> children) {
		this.children = children;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

}

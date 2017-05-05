package br.order.vo;

import java.io.Serializable;
import java.util.List;

import br.order.pojo.BrOperation;

public class BrOperationVo extends BrOperation implements Serializable {

	private List<String> form_power_permission;

	//是否选中
	private Boolean operationFlag;
	
	

	public Boolean getOperationFlag() {
		return operationFlag;
	}

	public void setOperationFlag(Boolean operationFlag) {
		this.operationFlag = operationFlag;
	}

	public List<String> getForm_power_permission() {
		return form_power_permission;
	}

	public void setForm_power_permission(List<String> form_power_permission) {
		this.form_power_permission = form_power_permission;
	}

	
}

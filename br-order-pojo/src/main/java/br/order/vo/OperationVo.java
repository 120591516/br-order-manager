package br.order.vo;

import java.io.Serializable;

import br.order.pojo.BrOperation;

public class OperationVo extends BrOperation implements Serializable {

	//是否选中
	private Boolean operationFlag;

	public Boolean getOperationFlag() {
		return operationFlag;
	}

	public void setOperationFlag(Boolean operationFlag) {
		this.operationFlag = operationFlag;
	}

}

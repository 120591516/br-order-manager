package br.order.service;

import java.util.List;

import br.order.pojo.BrOperation;
import br.order.pojo.BrRolePermission;

public interface BrOperationService {
	

	public List<BrOperation> getListByRole(BrRolePermission rolePermission);

}

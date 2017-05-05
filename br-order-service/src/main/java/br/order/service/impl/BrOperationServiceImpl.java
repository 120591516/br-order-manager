package br.order.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.order.mapper.BrOperationMapper;
import br.order.mapper.BrPermissionOperationMapper;
import br.order.pojo.BrOperation;
import br.order.pojo.BrPermissionOperation;
import br.order.pojo.BrPermissionOperationExample;
import br.order.pojo.BrRolePermission;
import br.order.service.BrOperationService;

@Service
public class BrOperationServiceImpl implements BrOperationService {

	@Autowired
	private BrOperationMapper mapper;
	
	@Autowired
	private BrPermissionOperationMapper poMapper;
	
	
	public List<BrOperation> getListByRole(BrRolePermission rolePermission) {
		List<BrOperation> result = new ArrayList<BrOperation>();
		BrPermissionOperationExample poExample = new BrPermissionOperationExample();
		if (null != rolePermission) {
			BrPermissionOperationExample.Criteria criteria = poExample.createCriteria();
			if (null != rolePermission.getRolePermissionId()) {
				criteria.andRolePermissionIdEqualTo(rolePermission.getRolePermissionId());
			}
			List<BrPermissionOperation> poList = poMapper.selectByExample(poExample);
			for (BrPermissionOperation brPermissionOperation : poList) {
				result.add(mapper.selectByPrimaryKey(brPermissionOperation.getOperationId()));
			}
		}
		return result;
	}

}

package br.order.mapper.self;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import br.order.pojo.BrPermissionOperation;

public interface BrPermissionOperationSelfMapper {

	List<BrPermissionOperation> getBrPer_OpeListByPerId(Long permissionId);

	int insertOption(@Param("permissionId") Integer permissionId, @Param("operationId") Integer operationId);

}

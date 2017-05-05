package br.order.mapper.self;

import java.util.List;

import br.order.pojo.BrOperation;

public interface BrOperationMapperQu {

	List<BrOperation> getBrOperationList(int intValue);

	List<BrOperation> getBrOperationListByIdAndOpen(int longValue);

	

}

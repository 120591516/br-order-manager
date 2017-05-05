package br.order.mapper;

import br.order.pojo.BrOperation;
import br.order.pojo.BrOperationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrOperationMapper {
    int countByExample(BrOperationExample example);

    int deleteByExample(BrOperationExample example);

    int deleteByPrimaryKey(Long operationId);

    int insert(BrOperation record);

    int insertSelective(BrOperation record);

    List<BrOperation> selectByExample(BrOperationExample example);

    BrOperation selectByPrimaryKey(Long operationId);

    int updateByExampleSelective(@Param("record") BrOperation record, @Param("example") BrOperationExample example);

    int updateByExample(@Param("record") BrOperation record, @Param("example") BrOperationExample example);

    int updateByPrimaryKeySelective(BrOperation record);

    int updateByPrimaryKey(BrOperation record);
}
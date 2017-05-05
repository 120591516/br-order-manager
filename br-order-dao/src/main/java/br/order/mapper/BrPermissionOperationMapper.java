package br.order.mapper;

import br.order.pojo.BrPermissionOperation;
import br.order.pojo.BrPermissionOperationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrPermissionOperationMapper {
    int countByExample(BrPermissionOperationExample example);

    int deleteByExample(BrPermissionOperationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BrPermissionOperation record);

    int insertSelective(BrPermissionOperation record);

    List<BrPermissionOperation> selectByExample(BrPermissionOperationExample example);

    BrPermissionOperation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BrPermissionOperation record, @Param("example") BrPermissionOperationExample example);

    int updateByExample(@Param("record") BrPermissionOperation record, @Param("example") BrPermissionOperationExample example);

    int updateByPrimaryKeySelective(BrPermissionOperation record);

    int updateByPrimaryKey(BrPermissionOperation record);
}
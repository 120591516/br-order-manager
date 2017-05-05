package br.order.mapper;

import br.order.pojo.BrPermission;
import br.order.pojo.BrPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrPermissionMapper {
    int countByExample(BrPermissionExample example);

    int deleteByExample(BrPermissionExample example);

    int deleteByPrimaryKey(Long permissionId);

    int insert(BrPermission record);

    int insertSelective(BrPermission record);

    List<BrPermission> selectByExample(BrPermissionExample example);

    BrPermission selectByPrimaryKey(Long permissionId);

    int updateByExampleSelective(@Param("record") BrPermission record, @Param("example") BrPermissionExample example);

    int updateByExample(@Param("record") BrPermission record, @Param("example") BrPermissionExample example);

    int updateByPrimaryKeySelective(BrPermission record);

    int updateByPrimaryKey(BrPermission record);
}
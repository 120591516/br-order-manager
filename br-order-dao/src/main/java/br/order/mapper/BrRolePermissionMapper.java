package br.order.mapper;

import br.order.pojo.BrRolePermission;
import br.order.pojo.BrRolePermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrRolePermissionMapper {
    int countByExample(BrRolePermissionExample example);

    int deleteByExample(BrRolePermissionExample example);

    int deleteByPrimaryKey(Long rolePermissionId);

    int insert(BrRolePermission record);

    int insertSelective(BrRolePermission record);

    List<BrRolePermission> selectByExample(BrRolePermissionExample example);

    BrRolePermission selectByPrimaryKey(Long rolePermissionId);

    int updateByExampleSelective(@Param("record") BrRolePermission record, @Param("example") BrRolePermissionExample example);

    int updateByExample(@Param("record") BrRolePermission record, @Param("example") BrRolePermissionExample example);

    int updateByPrimaryKeySelective(BrRolePermission record);

    int updateByPrimaryKey(BrRolePermission record);
}
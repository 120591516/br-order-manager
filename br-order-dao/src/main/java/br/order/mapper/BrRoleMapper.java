package br.order.mapper;

import br.order.pojo.BrRole;
import br.order.pojo.BrRoleExample;

import java.io.Serializable;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrRoleMapper {
    int countByExample(BrRoleExample example);

    int deleteByExample(BrRoleExample example);

    int deleteByPrimaryKey(Long roleId);

    int insert(BrRole record);

    int insertSelective(BrRole record);

    List<BrRole> selectByExample(BrRoleExample example);

    BrRole selectByPrimaryKey(Long roleId);

    int updateByExampleSelective(@Param("record") BrRole record, @Param("example") BrRoleExample example);

    int updateByExample(@Param("record") BrRole record, @Param("example") BrRoleExample example);

    int updateByPrimaryKeySelective(BrRole record);

    int updateByPrimaryKey(BrRole record);
}
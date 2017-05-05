package br.order.mapper;

import br.order.pojo.BrUserRole;
import br.order.pojo.BrUserRoleExample;
import br.order.pojo.permission.RoleVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrUserRoleMapper {
    int countByExample(BrUserRoleExample example);

    int deleteByExample(BrUserRoleExample example);

    int deleteByPrimaryKey(Long userRoleId);

    int insert(BrUserRole record);

    int insertSelective(BrUserRole record);

    List<BrUserRole> selectByExample(BrUserRoleExample example);

    BrUserRole selectByPrimaryKey(Long userRoleId);

    int updateByExampleSelective(@Param("record") BrUserRole record, @Param("example") BrUserRoleExample example);

    int updateByExample(@Param("record") BrUserRole record, @Param("example") BrUserRoleExample example);

    int updateByPrimaryKeySelective(BrUserRole record);

    int updateByPrimaryKey(BrUserRole record);

}
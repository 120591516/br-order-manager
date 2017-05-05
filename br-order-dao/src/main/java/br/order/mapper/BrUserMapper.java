package br.order.mapper;

import br.order.pojo.BrUser;
import br.order.pojo.BrUserExample;

import java.io.Serializable;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrUserMapper{
    int countByExample(BrUserExample example);

    int deleteByExample(BrUserExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(BrUser record);

    int insertSelective(BrUser record);

    List<BrUser> selectByExample(BrUserExample example);

    BrUser selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") BrUser record, @Param("example") BrUserExample example);

    int updateByExample(@Param("record") BrUser record, @Param("example") BrUserExample example);

    int updateByPrimaryKeySelective(BrUser record);

    int updateByPrimaryKey(BrUser record);
}
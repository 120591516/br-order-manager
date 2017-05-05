package br.order.mapper.emp;

import br.order.pojo.emp.Employee;
import br.order.pojo.emp.EmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
    int countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int deleteByPrimaryKey(Long empId);

    int insert(Employee record);

    int insertSelective(Employee record);

    List<Employee> selectByExample(EmployeeExample example);

    Employee selectByPrimaryKey(Long empId);

    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}
package br.order.service.impl.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.order.mapper.emp.EmployeeMapper;
import br.order.pojo.emp.Employee;
import br.order.pojo.emp.EmployeeExample;
import br.order.pojo.emp.EmployeeExample.Criteria;
import br.order.service.emp.EmpService;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmployeeMapper employeeMapper;
	
	/**
		 * <p>Title:getEmpByUserId</p> 
		 * <p>Description: 根据用户id查询员工信息</p> 
		 * @param userId
		 * @return
	     * @see br.order.service.emp.EmpService#getEmpByUserId(java.lang.Long)
		 */
	public Employee getEmpByUserId(Long userId) {
		EmployeeExample example = new EmployeeExample();
		Criteria criteria = example.createCriteria();
		criteria.andBrUserIdEqualTo(userId);
		List<Employee> list = employeeMapper.selectByExample(example);
		if(list != null && list.size()>0){
			return list.get(0);
		}
		return null;
	}

	/**
		 * <p>Title:updateEmp</p> 
		 * <p>Description: 修改员工信息</p> 
		 * @param employee
		 * @return
	     * @see br.order.service.emp.EmpService#updateEmp(br.order.pojo.emp.Employee)
		 */
	public int updateEmp(Employee employee) {
		return employeeMapper.updateByPrimaryKeySelective(employee);
	}

}

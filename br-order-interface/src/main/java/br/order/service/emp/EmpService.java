package br.order.service.emp;

import br.order.pojo.emp.Employee;

public interface EmpService {

	Employee getEmpByUserId(Long userId);

	int updateEmp(Employee employee);

}

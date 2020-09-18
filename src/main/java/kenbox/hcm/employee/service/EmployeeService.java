package kenbox.hcm.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import kenbox.hcm.employee.dao.DaoEmployee;
import kenbox.hcm.employee.dto.EmployeeDTO;
import kenbox.hcm.employee.qo.EmployeeRepository;

@Service
public class EmployeeService {
	private static List<EmployeeDTO> employees = new ArrayList<>();
	@Autowired EmployeeRepository employeeRepository;
	  static {
		  EmployeeDTO e1 = new EmployeeDTO();
		  e1.setEmpNo("1110");
		  e1.setEmpName("Ramesh Kumar");
		  
		  EmployeeDTO e2 = new EmployeeDTO();
		  e2.setEmpNo("1111");
		  e2.setEmpName("Mohen Kumar");
		  
		  EmployeeDTO e3 = new EmployeeDTO();
		  e3.setEmpNo("1112");
		  e3.setEmpName("Rakesh Kumar");
		  employees.add(e1);
		  employees.add(e2);
		  employees.add(e3);
	  }

	  
	  public List<DaoEmployee> findAllEmployees() {
	    return employeeRepository.findByCompanyId(100);
	  }
	  
	  public DaoEmployee addNewEmployee() {
		  DaoEmployee daoEmployee = new DaoEmployee();
		  daoEmployee.empId = 10002;
		  daoEmployee.firstName = "Jeery";
		  daoEmployee.lastName = "crush";
		  employeeRepository.save(daoEmployee);
		  return employeeRepository.findByEmpId(10002,100);
	  }
	  
	  public DaoEmployee updateEmployee() {
		  DaoEmployee daoEmployee = new DaoEmployee();
		  daoEmployee.empId = 10001;
		  daoEmployee.firstName = "Tom";
		  daoEmployee.lastName = "crush";
		  employeeRepository.save(daoEmployee);
		  return employeeRepository.findByEmpId(10001,100);
	  }
	  
	  public DaoEmployee getEmployeeByEmpId(int empId) {
		  return employeeRepository.findByEmpId(empId,100);
	  }
	  
	  
}

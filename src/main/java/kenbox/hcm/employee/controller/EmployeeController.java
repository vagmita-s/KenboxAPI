package kenbox.hcm.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kenbox.core.controller.AppController;
import kenbox.core.util.UserDTO;
import kenbox.hcm.employee.dao.DaoEmployee;
import kenbox.hcm.employee.dto.EmployeeDTO;
import kenbox.hcm.employee.service.EmployeeService;

@RestController
@CrossOrigin("http://localhost:3000")
public class EmployeeController extends AppController{
	@Autowired EmployeeService employeeManagementService;
	
	@GetMapping("/addEmployee")
	public DaoEmployee addEmployee(@RequestBody EmployeeDTO dataTeo) {
		UserDTO loginUser =  getLoginUser();
		return employeeManagementService.addNewEmployee();
	}	
	
	 @GetMapping("/getEmployee")
	public DaoEmployee getEmployee(@RequestParam int empId) {
		UserDTO loginUser =  getLoginUser();
		return employeeManagementService.getEmployeeByEmpId(empId,loginUser);
	}
	 
	@GetMapping("/getLoginUser")
	public DaoEmployee getLoginUserDetail() {
		UserDTO loginUser =  getLoginUser();
		return employeeManagementService.getEmployeeByEmpId(loginUser.getEmpId(),loginUser);
	}
	
	@GetMapping("/updateEmployee")
	public DaoEmployee updateEmployee(@RequestBody EmployeeDTO dataTeo) {
		UserDTO loginUser =  getLoginUser();
		return employeeManagementService.addNewEmployee();
	}
	
	@GetMapping("/employees")
	public List<DaoEmployee> getAllEmployees() {
		UserDTO loginUser =  getLoginUser();
		return employeeManagementService.findAllEmployees();
	}
	
	@GetMapping("/dashboard")
	public String  dashboard() {
		UserDTO loginUser = getLoginUser();
		System.out.println("dashboard userName :: "+loginUser.getUserName() + "and firstName :: "+loginUser.getFirstName());
		return "success";
	}
}

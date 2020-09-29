package kenbox.hcm.organisationannouncement.controller;

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
import kenbox.hcm.organisationannouncement.dao.DaoOrganisationAnnouncement;
import kenbox.hcm.organisationannouncement.service.OrganisationAnnouncementService;

@RestController
@CrossOrigin("http://localhost:3000")
public class OrganisationAnnouncementController extends AppController{
	@Autowired OrganisationAnnouncementService organisationAnnouncementManagementService;
	
//	@GetMapping("/addEmployee")
//	public DaoEmployee addEmployee(@RequestBody EmployeeDTO dataTeo) {
//		UserDTO loginUser =  getLoginUser();
//		return employeeManagementService.addNewEmployee();
//	}
	
	
	/*
	 @GetMapping("/getEmployee")
	 
	public DaoEmployee getEmployee(@RequestParam int empId) {
		UserDTO loginUser =  getLoginUser();
		return employeeManagementService.getEmployeeByEmpId(empId);
	}
	*/
//	 @GetMapping("/getEmployee")
//	 
//		public ResponseEntity<?> getEmployee(@RequestParam String userName) {
//			UserDTO loginUser =  getLoginUser();
//			return employeeManagementService.getEmployeeByUserName(userName);
//		}
	
//	@GetMapping("/updateEmployee")
//	public DaoEmployee updateEmployee(@RequestBody EmployeeDTO dataTeo) {
//		UserDTO loginUser =  getLoginUser();
//		return employeeManagementService.addNewEmployee();
//	}
//	
	@GetMapping("/getAnnouncements")
	public List<DaoOrganisationAnnouncement> getAllOrganisationAnnouncement() {
		UserDTO loginUser =  getLoginUser();
		System.out.println();
		return organisationAnnouncementManagementService.findAllOrganisationAnnouncement(loginUser);
	}
	
//	@GetMapping("/dashboard")
//	public String  dashboard() {
//		UserDTO loginUser = getLoginUser();
//		System.out.println("dashboard userName :: "+loginUser.getUserName() + "and firstName :: "+loginUser.getFirstName());
//		return "success";
//	}
}

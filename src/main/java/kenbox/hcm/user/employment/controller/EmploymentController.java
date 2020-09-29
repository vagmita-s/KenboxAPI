package kenbox.hcm.user.employment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kenbox.hcm.user.employment.dto.EmploymentDTO;
import kenbox.hcm.user.employment.service.EmploymentService;
import kenbox.hcm.user.familyInformation.dto.FamilyInformationDTO;
import kenbox.hcm.user.familyInformation.service.FamilyInformationService;
import kenbox.hcm.user.qualification.dto.QualificationDTO;
import kenbox.hcm.user.qualification.service.QualificationService;



@RestController
@CrossOrigin("http://localhost:3000")
public class EmploymentController {
@Autowired EmploymentService employmentService;
	
	
	
	@GetMapping("/getEmployment")
	public EmploymentDTO getById(@RequestParam int empId) {
//		UserDTO loginUser =  getLoginUser();
		return employmentService.getById(empId,100);
	}

}

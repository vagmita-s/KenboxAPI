package kenbox.hcm.user.qualification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import kenbox.hcm.user.familyInformation.dto.FamilyInformationDTO;
import kenbox.hcm.user.familyInformation.service.FamilyInformationService;
import kenbox.hcm.user.qualification.dto.QualificationDTO;
import kenbox.hcm.user.qualification.service.QualificationService;



@RestController
@CrossOrigin("http://localhost:3000")
public class QualificationController {
@Autowired QualificationService qualificationService;
	
	
	
	@GetMapping("/getQualification")
	public QualificationDTO getById(@RequestParam int empId) {
//		UserDTO loginUser =  getLoginUser();
		return qualificationService.getById(empId,100);
	}

}

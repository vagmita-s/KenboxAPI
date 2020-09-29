package kenbox.hcm.user.familyInformation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import kenbox.hcm.user.familyInformation.dto.FamilyInformationDTO;
import kenbox.hcm.user.familyInformation.service.FamilyInformationService;



@RestController
@CrossOrigin("http://localhost:3000")
public class FamilyInformationController {
@Autowired FamilyInformationService familyInformationService;
	
	
	
	@GetMapping("/getFamilyInfo")
	public FamilyInformationDTO getById(@RequestParam int empId) {
//		UserDTO loginUser =  getLoginUser();
		return familyInformationService.getById(empId,100);
	}

}

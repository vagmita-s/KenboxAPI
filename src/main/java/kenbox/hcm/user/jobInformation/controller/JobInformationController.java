package kenbox.hcm.user.jobInformation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kenbox.hcm.user.basicInformation.dto.BasicInformationDTO;
import kenbox.hcm.user.basicInformation.service.BasicInformationService;
import kenbox.hcm.user.jobInformation.dto.JobInformationDTO;
import kenbox.hcm.user.jobInformation.service.JobInformationService;

@RestController
@CrossOrigin("http://localhost:3000")
public class JobInformationController {
@Autowired JobInformationService jobInformationService;
	
	
	
	@GetMapping("/getJobInfo")
	public JobInformationDTO getById(@RequestParam int empId) {
//		UserDTO loginUser =  getLoginUser();
		return jobInformationService.getById(empId,100);
	}

}

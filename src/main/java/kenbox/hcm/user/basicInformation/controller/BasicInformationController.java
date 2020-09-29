package kenbox.hcm.user.basicInformation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kenbox.core.controller.AppController;
import kenbox.core.util.UserDTO;
import kenbox.hcm.user.basicInformation.dto.BasicInformationDTO;
import kenbox.hcm.user.basicInformation.service.BasicInformationService;

@RestController
@CrossOrigin("http://localhost:3000")
public class BasicInformationController extends AppController{
	
	@Autowired BasicInformationService basicInformationService;
	
	
	
//	@GetMapping("/getBasicInfo")
//	public BasicInformationDTO getById(@RequestParam int empId) {
//		UserDTO loginUser =  getLoginUser();
//		return basicInformationService.getById(empId);
//	}
	@GetMapping("/getBasicInfo")
	public BasicInformationDTO getById(@RequestParam String firstName) {
		UserDTO loginUser =  getLoginUser();
		return basicInformationService.getByFirstName(firstName);
	}
	
//	@PostMapping("/master/create")
//	public AppMasterDTO addNewMaster(@RequestBody AppMasterDTO dataTeo) {
//		UserDTO loginUser =  getLoginUser();
//		return appMasterManagementService.addNewAppMaster(dataTeo,loginUser);
//	}
//	
//	@PostMapping("/master/update")//code to be added
//	public AppMasterDTO updateMasterById(@RequestBody AppMasterDTO dataTeo) {
//		UserDTO loginUser =  getLoginUser();
//		return appMasterManagementService.updateAppMaster(dataTeo,loginUser);
//
//	}
//	
//	@GetMapping("/master/getAll")
//	public AppMasterDTO[] getAllMaster(@RequestParam String appMasterType) {
//		UserDTO loginUser =  getLoginUser();
//		return appMasterManagementService.getAllMasterByType(appMasterType,loginUser);
//	}
//	
	
}

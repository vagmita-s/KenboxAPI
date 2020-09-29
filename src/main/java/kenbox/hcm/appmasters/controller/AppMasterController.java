package kenbox.hcm.appmasters.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kenbox.core.controller.AppController;
import kenbox.core.util.UserDTO;
import kenbox.hcm.appmasters.dto.AppMasterDTO;
import kenbox.hcm.appmasters.service.AppMasterService;

@RestController
@CrossOrigin("http://localhost:3000")
public class AppMasterController extends AppController{
	
	@Autowired AppMasterService appAttributeManagementService;
	
	@PostMapping("/createAppAttribute")
	public AppMasterDTO addNewMaster(@RequestBody AppMasterDTO dataTeo) {
		UserDTO loginUser =  getLoginUser();
		return appAttributeManagementService.addNewAppMaster(dataTeo,loginUser);
	}
	
	@GetMapping("/appAttribute/get")
	public AppMasterDTO getMasterById(@RequestParam String appMasterType, @RequestParam int appMasterId) {
		UserDTO loginUser =  getLoginUser();
		return appAttributeManagementService.getMasterByTypeAndId(appMasterType, appMasterId,loginUser);
	}
	
	@PostMapping("/appAttribute/update")//code to be added
	public AppMasterDTO updateMasterById(@RequestBody AppMasterDTO dataTeo) {
		UserDTO loginUser =  getLoginUser();
		return appAttributeManagementService.updateAppMaster(dataTeo,loginUser);

	}
	
	@GetMapping("/appAttribute/getAll")
	public AppMasterDTO[] getAllMaster(@RequestParam String appMasterType) {
		UserDTO loginUser =  getLoginUser();
		return appAttributeManagementService.getAllMasterByType(appMasterType,loginUser);
	}
	
	
}

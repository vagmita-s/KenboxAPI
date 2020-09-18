package kenbox.hcm.tenant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kenbox.hcm.tenant.dto.AppTenantDTO;
import kenbox.hcm.tenant.service.AppTenantService;

@RestController
@CrossOrigin("http://localhost:3000")
public class AppTenantController {
	
	@Autowired AppTenantService appTenantService;
	
	@GetMapping("/addDefaultTenant")
	public AppTenantDTO[] addDefaultTenant() {
		return appTenantService.addDefaultTeannts();
	}
	
	
}

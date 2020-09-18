package kenbox.hcm.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kenbox.hcm.company.dto.CompanyDTO;
import kenbox.hcm.company.service.CompanyService;

@RestController
@CrossOrigin("http://localhost:3000")
public class CompanyController {
	
	@Autowired CompanyService companyService;
	
	@GetMapping("/addDefaultCompany")
	public CompanyDTO[] addDefaultCompany() {
		return companyService.addDefaultCompanies();
	}
	
	
}

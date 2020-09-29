package kenbox.hcm.organisationannouncement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import kenbox.hcm.user.basicInformation.qo.BasicInformationRepository;
import kenbox.hcm.user.basicInformation.service.BasicInformationService;
import kenbox.core.util.UserDTO;
import kenbox.core.util.UserTEO;
import kenbox.hcm.authentication.mapper.JwtResponse;
import kenbox.hcm.employee.dao.DaoEmployee;
import kenbox.hcm.employee.dto.EmployeeDTO;
import kenbox.hcm.employee.qo.EmployeeRepository;
import kenbox.hcm.organisationannouncement.dao.DaoOrganisationAnnouncement;
import kenbox.hcm.organisationannouncement.qo.OrganisationAnnouncementRepository;
import kenbox.hcm.user.jobInformation.qo.JobInformationRepository;

@Service
public class OrganisationAnnouncementService {
//	
	@Autowired OrganisationAnnouncementRepository organisationAnnouncementRepository;
//	
	  
	  public List<DaoOrganisationAnnouncement> findAllOrganisationAnnouncement(UserDTO loginUser) {
	    return (List<DaoOrganisationAnnouncement>) organisationAnnouncementRepository.findByCompanyId(loginUser.getCompanyId());
	    
	  }
	  
	  
		
}

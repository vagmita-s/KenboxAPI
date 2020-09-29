package kenbox.hcm.user.employment.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kenbox.hcm.user.employment.dao.DaoEmployment;
import kenbox.hcm.user.employment.dto.EmploymentDTO;
import kenbox.hcm.user.employment.qo.EmploymentRepository;
import kenbox.hcm.user.familyInformation.dao.DaoFamilyInformation;
import kenbox.hcm.user.familyInformation.dto.FamilyInformationDTO;
import kenbox.hcm.user.familyInformation.qo.FamilyInformationRepository;
import kenbox.hcm.user.qualification.dao.DaoQualification;
import kenbox.hcm.user.qualification.dto.QualificationDTO;
import kenbox.hcm.user.qualification.qo.QualificationRepository;


@Service
public class EmploymentService {

	@Autowired EmploymentRepository employmentRepository;
	
	public EmploymentDTO getById(int empId, int companyId) {
		
		EmploymentDTO teo = copyDaoToTeo(employmentRepository.findByEmpId(empId, companyId));
		return teo;
	}
	
	private EmploymentDTO copyDaoToTeo(DaoEmployment dao) {
		EmploymentDTO teo = new EmploymentDTO();
		BeanUtils.copyProperties(dao, teo);
		return teo;
	}
	
}

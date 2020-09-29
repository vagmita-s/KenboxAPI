package kenbox.hcm.user.qualification.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kenbox.hcm.user.familyInformation.dao.DaoFamilyInformation;
import kenbox.hcm.user.familyInformation.dto.FamilyInformationDTO;
import kenbox.hcm.user.familyInformation.qo.FamilyInformationRepository;
import kenbox.hcm.user.qualification.dao.DaoQualification;
import kenbox.hcm.user.qualification.dto.QualificationDTO;
import kenbox.hcm.user.qualification.qo.QualificationRepository;


@Service
public class QualificationService {

	@Autowired QualificationRepository qualificationRepository;
	
	public QualificationDTO getById(int empId, int companyId) {
		
		QualificationDTO teo = copyDaoToTeo(qualificationRepository.findByEmpId(empId, companyId));
		return teo;
	}
	
	private QualificationDTO copyDaoToTeo(DaoQualification dao) {
		QualificationDTO teo = new QualificationDTO();
		BeanUtils.copyProperties(dao, teo);
		return teo;
	}
	
}

package kenbox.hcm.user.familyInformation.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kenbox.hcm.user.familyInformation.dao.DaoFamilyInformation;
import kenbox.hcm.user.familyInformation.dto.FamilyInformationDTO;
import kenbox.hcm.user.familyInformation.qo.FamilyInformationRepository;


@Service
public class FamilyInformationService {

	@Autowired FamilyInformationRepository familyInformationRepository;
	
	public FamilyInformationDTO getById(int empId, int companyId) {
		
		FamilyInformationDTO teo = copyDaoToTeo(familyInformationRepository.findByEmpId(empId, companyId));
		return teo;
	}
	
	private FamilyInformationDTO copyDaoToTeo(DaoFamilyInformation dao) {
		FamilyInformationDTO teo = new FamilyInformationDTO();
		BeanUtils.copyProperties(dao, teo);
		return teo;
	}
	
}

package kenbox.hcm.user.basicInformation.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import kenbox.hcm.user.basicInformation.dao.DaoBasicInformation;
import kenbox.hcm.user.basicInformation.dto.BasicInformationDTO;
import kenbox.hcm.user.basicInformation.qo.BasicInformationRepository;


@Service
public class BasicInformationService {
	
	@Autowired BasicInformationRepository basicInformationRepository;
		
	public BasicInformationDTO getByFirstName(String firstName ) {
		BasicInformationDTO teo = copyDaoToTeo(basicInformationRepository.findByFirstName(firstName));
		return teo;
	}
	
	private BasicInformationDTO copyDaoToTeo(DaoBasicInformation dao) {
		BasicInformationDTO teo = new BasicInformationDTO();
		BeanUtils.copyProperties(dao, teo);
		return teo;
	}
	
}

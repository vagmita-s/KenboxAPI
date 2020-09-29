package kenbox.hcm.user.jobInformation.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kenbox.hcm.user.jobInformation.dao.DaoJobInformation;
import kenbox.hcm.user.jobInformation.dto.JobInformationDTO;
import kenbox.hcm.user.jobInformation.qo.JobInformationRepository;


@Service
public class JobInformationService {

	@Autowired JobInformationRepository jobInformationRepository;
	
	public JobInformationDTO getById(int empId, int companyId) {
		
		JobInformationDTO teo = copyDaoToTeo(jobInformationRepository.findByEmpId(empId, companyId));
		return teo;
	}
	
	private JobInformationDTO copyDaoToTeo(DaoJobInformation dao) {
		JobInformationDTO teo = new JobInformationDTO();
		BeanUtils.copyProperties(dao, teo);
		return teo;
	}
	
}

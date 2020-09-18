package kenbox.hcm.company.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kenbox.core.util.UserDTO;
import kenbox.hcm.company.dao.DaoCompany;
import kenbox.hcm.company.dto.CompanyDTO;
import kenbox.hcm.company.qo.CompanyRepository;

@Service
public class CompanyService {
	
	@Autowired CompanyRepository companyRepository;
	public CompanyDTO addNewAppCompany(CompanyDTO teo, UserDTO loginUser) {
		DaoCompany dao = copyTeoToDao(teo,loginUser);
		companyRepository.save(dao);
		teo = copyDaoToTeo(companyRepository.findCompanyByCompanyName(teo.getCompanyName()),loginUser);
		return teo;
	}
	
	
	public CompanyDTO[] getAllCompanies(UserDTO loginUser) {
		List<DaoCompany> listOfCompanies = companyRepository.findAll();
		CompanyDTO[] teos = new CompanyDTO[0];
		if(listOfCompanies != null && listOfCompanies.size() > 0) {
			teos = new CompanyDTO[listOfCompanies.size()];
			for (int i = 0; i < teos.length; i++) {
				teos[i] = copyDaoToTeo(listOfCompanies.get(i),loginUser);
			}
		}
		return teos;
	}
	
	public CompanyDTO getCompanyByCompanyName(String companyName, UserDTO loginUser) {
		CompanyDTO teo = copyDaoToTeo(companyRepository.findCompanyByCompanyName(companyName),loginUser);
		return teo;
	}
	
	public CompanyDTO getCompanyByCompanyId(int companyId, UserDTO loginUser) {
		CompanyDTO teo = copyDaoToTeo(companyRepository.findCompanyByCompanyId(companyId),loginUser);
		return teo;
	}
	
	public CompanyDTO[] addDefaultCompanies() {
		addCompaniesInfo();
		return getAllCompanies(null);
	}
	
	public void addCompaniesInfo() {

		DaoCompany companyDTO = new DaoCompany();
		companyDTO.companyId = 1;
		companyDTO.companyName = "kenbox";
		companyDTO.createdBy =1;
		companyDTO.createdOn = new Date();
		companyDTO.status = 0;
		companyDTO.luts = System.currentTimeMillis();
		companyRepository.save(companyDTO);
		companyDTO = new DaoCompany();
		companyDTO.companyId = 1001;
		companyDTO.companyName = "local";
		companyDTO.createdBy =1;
		companyDTO.createdOn = new Date();
		companyDTO.status = 0;
		companyDTO.luts = System.currentTimeMillis();
		companyRepository.save(companyDTO);
	}

	private CompanyDTO copyDaoToTeo(DaoCompany dao, UserDTO loginUser) {
		CompanyDTO teo = new CompanyDTO();
		BeanUtils.copyProperties(dao, teo);
		return teo;
	}
	private DaoCompany copyTeoToDao(CompanyDTO teo, UserDTO loginUser) {
		DaoCompany dao = new DaoCompany();
		BeanUtils.copyProperties(teo, dao);
		return dao;
	}
}

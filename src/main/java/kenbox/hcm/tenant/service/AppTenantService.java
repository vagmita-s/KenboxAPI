package kenbox.hcm.tenant.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kenbox.core.util.UserTEO;
import kenbox.hcm.tenant.dao.DaoAppTenant;
import kenbox.hcm.tenant.dto.AppTenantDTO;
import kenbox.hcm.tenant.qo.AppTenantRepository;

@Service
public class AppTenantService {
	
	@Autowired AppTenantRepository appTenantRepository;
	public AppTenantDTO addNewAppTenant(AppTenantDTO teo, UserTEO loginUser) {
		DaoAppTenant dao = copyTeoToDao(teo,loginUser);
		appTenantRepository.save(dao);
		teo = copyDaoToTeo(appTenantRepository.findTenantByTenantName(teo.getTenantName()),loginUser);
		return teo;
	}
	
	
	public AppTenantDTO[] getAllAppTenants(UserTEO loginUser) {
		List<DaoAppTenant> listOfTenants = appTenantRepository.findAll();
		AppTenantDTO[] teos = new AppTenantDTO[0];
		if(listOfTenants != null && listOfTenants.size() > 0) {
			teos = new AppTenantDTO[listOfTenants.size()];
			for (int i = 0; i < teos.length; i++) {
				teos[i] = copyDaoToTeo(listOfTenants.get(i),loginUser);
			}
		}
		return teos;
	}
	
	public AppTenantDTO getTenantByTenantName(String tenantName, UserTEO loginUser) {
		AppTenantDTO teo = copyDaoToTeo(appTenantRepository.findTenantByTenantName(tenantName),loginUser);
		return teo;
	}
	
	public AppTenantDTO getTenantByTenantId(int tenantId, UserTEO loginUser) {
		AppTenantDTO teo = copyDaoToTeo(appTenantRepository.findTenantByTenantId(tenantId),loginUser);
		return teo;
	}
	
	public AppTenantDTO[] addDefaultTeannts() {
		addTenantsInfo();
		return getAllAppTenants(null);
	}
	
	public void addTenantsInfo() {

		DaoAppTenant appTenantDTO = new DaoAppTenant();
		appTenantDTO.tenantId = 1;
		appTenantDTO.tenantName = "kenbox";
		appTenantDTO.createdBy =1;
		appTenantDTO.createdOn = new Date();
		appTenantDTO.status = 0;
		appTenantDTO.luts = System.currentTimeMillis();
		appTenantRepository.save(appTenantDTO);
		appTenantDTO = new DaoAppTenant();
		appTenantDTO.tenantId = 1001;
		appTenantDTO.tenantName = "local";
		appTenantDTO.createdBy =1;
		appTenantDTO.createdOn = new Date();
		appTenantDTO.status = 0;
		appTenantDTO.luts = System.currentTimeMillis();
		appTenantRepository.save(appTenantDTO);
	}

	private AppTenantDTO copyDaoToTeo(DaoAppTenant dao, UserTEO loginUser) {
		AppTenantDTO teo = new AppTenantDTO();
		BeanUtils.copyProperties(dao, teo);
		return teo;
	}
	private DaoAppTenant copyTeoToDao(AppTenantDTO teo, UserTEO loginUser) {
		DaoAppTenant dao = new DaoAppTenant();
		BeanUtils.copyProperties(teo, dao);
		return dao;
	}
}

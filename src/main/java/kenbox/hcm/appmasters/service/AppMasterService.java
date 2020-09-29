package kenbox.hcm.appmasters.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kenbox.core.util.PrimaryIdGenerator;
import kenbox.core.util.UserDTO;
import kenbox.hcm.appmasters.dao.DaoAppMaster;
import kenbox.hcm.appmasters.dto.AppMasterDTO;
import kenbox.hcm.appmasters.qo.AppMasterRepository;
import kenbox.hcm.tenant.dao.DaoTableSequences;
import kenbox.hcm.tenant.qo.TableSequenceRepository;

@Service
public class AppMasterService {
	
	@Autowired AppMasterRepository appMasterRepository;
	public AppMasterDTO addNewAppMaster(AppMasterDTO teo, UserDTO loginUser) {
		DaoAppMaster dao = copyTeoToDao(teo,loginUser);
		dao.appMasterId = PrimaryIdGenerator.getInstance().getPrimaryIdForTable("APPMASTER", loginUser);
		appMasterRepository.save(dao);
		teo = copyDaoToTeo(appMasterRepository.findMasterByAppMasterId(teo.getAppMasterType(), teo.getAppMasterId(), loginUser.getCompanyId()),loginUser);
		return teo;
	}
	
	public AppMasterDTO updateAppMaster(AppMasterDTO teo, UserDTO loginUser) {
		DaoAppMaster dao = copyTeoToDao(teo,loginUser);
		appMasterRepository.save(dao);
		teo = copyDaoToTeo(appMasterRepository.findMasterByAppMasterId(teo.getAppMasterType(), teo.getAppMasterId(), loginUser.getCompanyId()),loginUser);
		return teo;
	}
	
	public AppMasterDTO[] getAllMasterByType(String appMasterType, UserDTO loginUser) {
		List<DaoAppMaster> listOfMasters = appMasterRepository.findMasterByAppMasterType(appMasterType, loginUser.getCompanyId());
		AppMasterDTO[] teos = new AppMasterDTO[0];
		if(listOfMasters != null && listOfMasters.size() > 0) {
			teos = new AppMasterDTO[listOfMasters.size()];
			for (int i = 0; i < teos.length; i++) {
				teos[i] = copyDaoToTeo(listOfMasters.get(i),loginUser);
			}
		}
		return teos;
	}
	
	public AppMasterDTO getMasterByTypeAndId(String appMasterType,int appMasterId, UserDTO loginUser) {
		AppMasterDTO teo = copyDaoToTeo(appMasterRepository.findMasterByAppMasterId(appMasterType, appMasterId,loginUser.getCompanyId()),loginUser);
		return teo;
	}
	
	public void deleteAppMasterByTypeAndId(String type, int id, UserDTO loginUser) {
		appMasterRepository.deleteAppMasterByTypeAndId(type,id,loginUser.getCompanyId());
	}

	private AppMasterDTO copyDaoToTeo(DaoAppMaster dao, UserDTO loginUser) {
		AppMasterDTO teo = new AppMasterDTO();
		teo.setAppMasterId(dao.appMasterId);
		teo.setAppMasterName(dao.appMasterName);
		teo.setAppMasterType(dao.appMasterType);
		teo.setDescription(dao.description);
		return teo;
	}
	private DaoAppMaster copyTeoToDao(AppMasterDTO teo, UserDTO loginUser) {
		DaoAppMaster dao = new DaoAppMaster();
		dao.appMasterName =teo.getAppMasterName();
		dao.appMasterType = teo.getAppMasterType();
		dao.companyId = loginUser.getCompanyId();
		dao.createdBy = loginUser.getEmpId();
		dao.createdOn = new Date();
		dao.luts = System.currentTimeMillis();
		
		return dao;
	}
}

package kenbox.hcm.appmasters.qo;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import kenbox.core.db.BaseDBRepository;
import kenbox.hcm.appmasters.dao.DaoAppMaster;

public interface AppMasterRepository extends BaseDBRepository<DaoAppMaster> { 
	public List<DaoAppMaster> findMasterByAppMasterType(String appMasterType,int companyId);
	public DaoAppMaster findMasterByAppMasterId(String appMasterType, int appMasterId, int companyId);
	
	@Query("SELECT * FROM APPMASTER WHERE appMasterType=:appMasterType AND companyId=:companyId ORDER BY appMasterId LIMIT 1")
	public DaoAppMaster getMaxAppMasterIdByType(@Param("appMasterType") String appMasterType,  @Param("companyId") int companyId);
	
	@Query("DELETE FROM APPMASTER WHERE appMasterType=:appMasterType AND appMasterId=:appMasterId AND companyId=:companyId")
	public void deleteAppMasterByTypeAndId(@Param("appMasterType") String appMasterType, @Param("appMasterId") int appMasterId, @Param("companyId") int companyId);
	
}

package kenbox.hcm.user.basicInformation.qo;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import kenbox.core.db.BaseDBRepository;
import kenbox.hcm.appmasters.dao.DaoAppMaster;
import kenbox.hcm.user.basicInformation.dao.DaoBasicInformation;

public interface BasicInformationRepository extends BaseDBRepository<DaoBasicInformation> { 

	public DaoBasicInformation findByBasicInformationId(int empId, int companyId);
	
	public DaoBasicInformation findByEmpId(int empId);
	
	public DaoBasicInformation findByFirstName(String firstName);
	
//	@Query("SELECT * FROM APPMASTER WHERE appMasterType=:appMasterType AND companyId=:companyId ORDER BY appMasterId LIMIT 1")
//	public DaoBasicInformation getMaxAppMasterIdByType(@Param("appMasterType") String appMasterType,  @Param("companyId") int companyId);
//	
//	@Query("DELETE FROM APPMASTER WHERE appMasterType=:appMasterType AND appMasterId=:appMasterId AND companyId=:companyId")
//	public void deleteAppMasterByTypeAndId(@Param("appMasterType") String appMasterType, @Param("appMasterId") int appMasterId, @Param("companyId") int companyId);
//	
}

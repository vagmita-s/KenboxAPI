package kenbox.hcm.user.familyInformation.qo;

import kenbox.core.db.BaseDBRepository;
import kenbox.hcm.user.basicInformation.dao.DaoBasicInformation;
import kenbox.hcm.user.familyInformation.dao.DaoFamilyInformation;
import kenbox.hcm.user.jobInformation.dao.DaoJobInformation;

public interface FamilyInformationRepository extends BaseDBRepository<DaoFamilyInformation> { 

//	public DaoFamilyInformation findByFamilyInformationId(int empId, int companyId);
	
	public DaoFamilyInformation findByEmpId(int empId, int companyId);
}

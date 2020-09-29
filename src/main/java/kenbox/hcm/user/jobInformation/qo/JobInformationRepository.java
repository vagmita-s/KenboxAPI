package kenbox.hcm.user.jobInformation.qo;

import kenbox.core.db.BaseDBRepository;
import kenbox.hcm.user.basicInformation.dao.DaoBasicInformation;
import kenbox.hcm.user.jobInformation.dao.DaoJobInformation;

public interface JobInformationRepository extends BaseDBRepository<DaoJobInformation> { 

	public DaoJobInformation findByJobInformationId(int empId, int companyId);
	
	public DaoJobInformation findByEmpId(int empId, int companyId);
}

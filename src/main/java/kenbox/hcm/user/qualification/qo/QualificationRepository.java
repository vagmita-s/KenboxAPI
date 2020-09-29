package kenbox.hcm.user.qualification.qo;

import kenbox.core.db.BaseDBRepository;
import kenbox.hcm.user.qualification.dao.DaoQualification;


public interface QualificationRepository extends BaseDBRepository<DaoQualification> { 

//	public DaoFamilyInformation findByFamilyInformationId(int empId, int companyId);
	
	public DaoQualification findByEmpId(int empId, int companyId);
}

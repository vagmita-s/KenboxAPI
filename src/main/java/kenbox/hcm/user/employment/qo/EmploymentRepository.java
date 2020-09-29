package kenbox.hcm.user.employment.qo;

import kenbox.core.db.BaseDBRepository;
import kenbox.hcm.user.employment.dao.DaoEmployment;
import kenbox.hcm.user.qualification.dao.DaoQualification;


public interface EmploymentRepository extends BaseDBRepository<DaoEmployment> { 

//	public DaoFamilyInformation findByFamilyInformationId(int empId, int companyId);
	
	public DaoEmployment findByEmpId(int empId, int companyId);
}

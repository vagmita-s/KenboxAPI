package kenbox.hcm.user.documents.qo;

import kenbox.core.db.BaseDBRepository;
import kenbox.hcm.user.documents.dao.DaoDocument;
import kenbox.hcm.user.employment.dao.DaoEmployment;
import kenbox.hcm.user.qualification.dao.DaoQualification;


public interface DocumentRepository extends BaseDBRepository<DaoDocument> { 

//	public DaoFamilyInformation findByFamilyInformationId(int empId, int companyId);
	
	public DaoDocument findByEmpId(int empId, int companyId);
}

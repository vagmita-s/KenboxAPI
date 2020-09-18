package kenbox.hcm.company.qo;

import kenbox.core.db.BaseDBRepository;
import kenbox.hcm.company.dao.DaoCompany;

public interface CompanyRepository extends BaseDBRepository<DaoCompany> { 
	public DaoCompany findCompanyByCompanyName(String companyName);
	public DaoCompany findCompanyByCompanyId(int companyId);
	
}

package kenbox.hcm.employee.qo;

import kenbox.core.db.BaseDBRepository;
import kenbox.hcm.employee.dao.DaoEmployee;

public interface EmployeeRepository extends BaseDBRepository<DaoEmployee> { 
	public DaoEmployee findByEmpId(int empId,int companyId);
	public DaoEmployee findByFirstName(String firstName,int companyId);
	public DaoEmployee findByUserName(String firstName,int companyId);
}

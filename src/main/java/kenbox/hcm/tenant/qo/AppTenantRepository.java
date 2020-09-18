package kenbox.hcm.tenant.qo;

import kenbox.core.db.BaseDBRepository;
import kenbox.hcm.tenant.dao.DaoAppTenant;

public interface AppTenantRepository extends BaseDBRepository<DaoAppTenant> { 
	public DaoAppTenant findTenantByTenantName(String tenantName);
	public DaoAppTenant findTenantByTenantId(int tenantId);
	
}

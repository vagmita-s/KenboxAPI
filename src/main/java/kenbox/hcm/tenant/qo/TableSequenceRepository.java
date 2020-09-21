package kenbox.hcm.tenant.qo;

import kenbox.core.db.BaseDBRepository;
import kenbox.hcm.tenant.dao.DaoTableSequences;

public interface TableSequenceRepository extends BaseDBRepository<DaoTableSequences>{
	public DaoTableSequences findByTableName(String tableName, int companyId);
}

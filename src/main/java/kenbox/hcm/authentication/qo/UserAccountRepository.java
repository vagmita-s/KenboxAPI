package kenbox.hcm.authentication.qo;

import kenbox.core.db.BaseDBRepository;
import kenbox.hcm.authentication.dao.DaoUserAccount;

public interface UserAccountRepository extends BaseDBRepository<DaoUserAccount> {
	DaoUserAccount findByUserName(String userName, int companyId);
	DaoUserAccount findByToken(long token);
}

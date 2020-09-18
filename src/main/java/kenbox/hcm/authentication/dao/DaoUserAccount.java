package kenbox.hcm.authentication.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import kenbox.core.db.BaseDao;

@Document("USERACCOUNT")
public class DaoUserAccount extends BaseDao{
	@Id
	public String id;
	public String userName;
	public String password;
}

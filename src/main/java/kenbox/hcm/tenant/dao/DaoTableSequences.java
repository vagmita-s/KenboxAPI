package kenbox.hcm.tenant.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import kenbox.core.db.BaseDao;

@Document("TABLESEQUENCES")
public class DaoTableSequences extends BaseDao{
	@Id
	public String id;
	public String tableName;
    public int nextSeq = -1;

}

package kenbox.hcm.tenant.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import kenbox.core.db.BaseDao;

@Document("APPTENANT")
public class DaoAppTenant extends BaseDao{
	@Id
	public int tenantId;
	public String tenantName;
	public int status;
	public String param1;
	public String param2;
	public String param3;
	public String param4;
	public String param5;
	public String param6;
	public String param7;
	public String param8;
	
}

package kenbox.hcm.company.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import kenbox.core.db.BaseDao;

@Document("COMPANY")
public class DaoCompany extends BaseDao{
	@Id
	public String id;
	public String companyName;
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

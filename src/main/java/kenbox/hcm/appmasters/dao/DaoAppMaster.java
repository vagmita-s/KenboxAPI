package kenbox.hcm.appmasters.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import kenbox.core.db.BaseDao;

@Document("APPMASTER")
public class DaoAppMaster extends BaseDao{
	@Id
	public String id;
	public int appMasterId;
	public String appMasterName;
	public String appMasterType;
	public String description;
}

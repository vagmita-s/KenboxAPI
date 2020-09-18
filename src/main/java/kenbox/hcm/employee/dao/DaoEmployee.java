package kenbox.hcm.employee.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import kenbox.core.db.BaseDao;

@Document("EMPLOYEE")
public class DaoEmployee extends BaseDao{
	  @Id
	  public String id;
	  public int empId;
	  public String firstName;
	  public String middleName;
	  public String lastName;
	  public String email;
	  public String userName;
	  public int empStatus;
}

package kenbox.hcm.user.basicInformation.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import kenbox.core.db.BaseDao;

@Document("BASICINFORMATION")
public class DaoBasicInformation extends BaseDao{
	@Id
	 	public String id;
	    public String basicInformationId;
	  	public int empId;
	  	public String firstName;
	  	public String middleName;
	  	public String lastName;
	  	public String email;
	  	public String userName;
	  	public int empStatus;
	    public String title;
		public String dateOfBirth;
		public String gender;
		public String contactNumber;
}

package kenbox.hcm.user.jobInformation.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import kenbox.core.db.BaseDao;

@Document("JOBINFORMATION")
public class DaoJobInformation extends BaseDao{
	
	@Id
 	public String id;
	public String jobInformationId;
  	public int empId;
	public String band;
	public String grade;
	public String designation;
	public String reportingManager;
	public String hrManager;
	public String dateOfJoin;
	public String groupDateOfJoining;
	public String companyName;
	public String entity;
	public String department;
	public String employmentType;
	public String tenureOfCompany;

}

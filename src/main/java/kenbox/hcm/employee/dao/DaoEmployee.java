package kenbox.hcm.employee.dao;

import java.util.ArrayList;

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
	  //new fields
	public String title;
	public String dateOfBirth;
	public String gender;
	public String contactNumber;
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

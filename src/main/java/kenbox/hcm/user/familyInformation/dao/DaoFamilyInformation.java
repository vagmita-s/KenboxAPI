package kenbox.hcm.user.familyInformation.dao;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import kenbox.core.db.BaseDao;

@Document("FAMILYINFORMATION")
public class DaoFamilyInformation extends BaseDao{
	
	@Id
 	public String id;
  	public int empId;
	public String familyName;
	public String dateOfBirth;
	public String mobileNumber;
	public String age;
	public String profession;
	public String permanentAddress;
	public String placeOfResidence;
	public String relationship;
	public int totalChildren;
	public String personalMail;
	public String residentialAddress;
	public String medicalHistory;
	public String highestQualification;
	ArrayList<String> childrenDOB;

}

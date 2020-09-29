package kenbox.hcm.user.qualification.dao;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import kenbox.core.db.BaseDao;

@Document("QUALIFICATION")
public class DaoQualification extends BaseDao{
	
	@Id
 	public String id;
  	public int empId;
  	public String qualificationLevel;
  	public String degree;
  	public String specialization;
  	public String nameOfSchool;
  	public String university;
  	public String courseType;
  	public String finalScore;
  	public String scoreType;
  	public String startDate;
  	public String endDate;
  	public String ranking; 
  	public String nameOfTraining;
  	public String  locationOfTraining;
  	public String  nameOfOrganization;
  	public String  nameOfTrainingSchool;
  	public String  duration;
  	public String  majorLearnings;
  	public String  nameOfSponsoredCompany;
}

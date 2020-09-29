package kenbox.hcm.user.employment.dao;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import kenbox.core.db.BaseDao;

@Document("EMPLOYMENT")
public class DaoEmployment extends BaseDao{
	
	@Id
 	public String id;
  	public int empId;
  	public String experiencedType;
  	public String nameOfCompany;
  	public String employeeCode;
  	public String placeOfPostingLocation;
  	public String lastDesignation;
  	public String firstDesignation;
  	public String serviceStartDate;
  	public String serviceEndDate;
  	public String employmentType;
  	public String totalYearsOfStay;
  	public String totalPromotionsDuringStay;
  	public String majorResponsibilitiesHandled;
  	public String joiningCTC;
  	public String lastWithdrawnCTC;
  	public String averageGrowth;
  	public String reasonOfLeaving;
  	public String majorMilestones;
}

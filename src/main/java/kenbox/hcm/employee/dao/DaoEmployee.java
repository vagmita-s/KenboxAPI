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
	  //new fields-vagmita
	
	public String title;
	public String dateOfBirth;
	public String placeOfBirth;
	public String gender;
	public String contactNumber;
	public String religion;
	public String nationality;
	public String bloodType;
	public String weight;
	public String height;
	
	public String band;
	public String grade;
	public String designation;
	public String skipManager;
	public String reportingManager;
	public String hrManager;
	public String dateOfJoin;
	public String groupDateOfJoining;
	public String companyName;
	public String entity;
	public String department;
	public String subDepartment;
	public String function;
	public String subFunction;
	public String employmentType;	
	public String experienceInGroupCompany;
	public String jobType;
	public String tenureOfCompany;
  	
  	public String experiencedType;
  	public String nameOfCompany;
  	public String employeeCode;
  	public String placeOfPostingLocation;
  	public String lastDesignation;
  	public String firstDesignation;
  	public String serviceStartDate;
  	public String serviceEndDate;
  	public String totalYearsOfStay;
  	public String totalPromotionsDuringStay;
  	public String majorResponsibilitiesHandled;
  	public String joiningCTC;
  	public String lastWithdrawnCTC;
  	public String averageGrowth;
  	public String reasonOfLeaving;
  	public String majorMilestones;
  	public String experienceInCompany;
  	public String workLocation;
  	public String region;
  	public String branch;
  	public String country;
  	public String zone;
  	public String district;
  	
  	public String familyName;
	public String familyDateOfBirth;
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
	
	public String documentType;
  	public String nameOfDocument;
  	public String idType;
  	public String passport;
  	public String idNumber;
  	public String issuingAuthority;
  	public String placeOfIssue;
  	public String expiryDate;
  	
	public String highestQualification;
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
  	public String activityType;
  	public String activity;
  	public String participation;
  	public String numberOfHours;
  	public String participationLevel;
  	public String rewardType;	
  	public String description; 
  	public String dateOfAward;
  	public String rewardReason;
  	public String awardingAuthority;
  	
  	public String numberSalaryAccount;
  	public String accountNumber;
  	public String branchAddress;
  	public String accountNature;
  	public String bankName;
  	public String ifscCode;
  	public String branchName;
  	
  	public String addressType;
  	public String addressLine1;  	
  	public String addressLine2;
  	public String state;
  	public String pincode;
  	public String contactName;
  	
	
}

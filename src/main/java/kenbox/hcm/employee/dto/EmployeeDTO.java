package kenbox.hcm.employee.dto;

import kenbox.core.util.BaseDTO;

public class EmployeeDTO extends BaseDTO{
	private int empId = -1;
	private String email;
	private String userName;
	private int empStatus;
	private int employmentType;
	public String empName = null;
	private String empNo = null;
	private String location = null;
	private String userIpAddress = null;
	private long pwdUpdateTime;
	private String timeZoneId;
	private String userDateFormat;
	private String langPref = "default";
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getEmpStatus() {
		return empStatus;
	}
	public void setEmpStatus(int empStatus) {
		this.empStatus = empStatus;
	}
	public int getEmploymentType() {
		return employmentType;
	}
	public void setEmploymentType(int employmentType) {
		this.employmentType = employmentType;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getUserIpAddress() {
		return userIpAddress;
	}
	public void setUserIpAddress(String userIpAddress) {
		this.userIpAddress = userIpAddress;
	}
	
	public long getPwdUpdateTime() {
		return pwdUpdateTime;
	}
	public void setPwdUpdateTime(long pwdUpdateTime) {
		this.pwdUpdateTime = pwdUpdateTime;
	}
	public String getTimeZoneId() {
		return timeZoneId;
	}
	public void setTimeZoneId(String timeZoneId) {
		this.timeZoneId = timeZoneId;
	}
	public String getUserDateFormat() {
		return userDateFormat;
	}
	public void setUserDateFormat(String userDateFormat) {
		this.userDateFormat = userDateFormat;
	}
	public String getLangPref() {
		return langPref;
	}
	public void setLangPref(String langPref) {
		this.langPref = langPref;
	}
	
}

package kenbox.core.util;


 
public class UserDTO extends BaseDTO{
	private int empId = -1;
	private String email;
	private String userName;
	private int empStatus;
	private int employmentType;
	private String param1;
	private String param2;
	private String param3;
	public String empName = null;
	private String empNo = null;
	private String location = null;
	private String userIpAddress = null;
	private long pwdUpdateTime;
	private String timeZoneId;
	private String userDateFormat;
	private String langPref = "default";
	private String firstName;
	private String middleName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private long lastUpdatedTimestamp;
	private String currentCapacity = null; 

	public final String getCurrentCapacity() {
		return currentCapacity;
	}

	public final void setCurrentCapacity(String currentCapacity) {
		this.currentCapacity = currentCapacity;
	}

	public final String getTimeZoneId() {
		return timeZoneId;
	}

	public final void setTimeZoneId(String timeZoneId) {
		this.timeZoneId = timeZoneId;
	}

	public final long getPwdUpdateTime() {
		return pwdUpdateTime;
	}

	public final void setPwdUpdateTime(long pwdUpdateTime) {
		this.pwdUpdateTime = pwdUpdateTime;
	}

	public final String getUserIpAddress() {
		return userIpAddress;
	}

	public final void setUserIpAddress(String userIpAddress) {
		this.userIpAddress = userIpAddress;
	}

	public final int getEmpId() {
		return empId;
	}

	public final void setEmpId(int empId) {
		this.empId = empId;
	}

	public final String getEmpName() {
		return empName;
	}

	public final void setEmpName(String empName) {
		this.empName = empName;
	}

	public final String getEmpNo() {
		return empNo;
	}

	public final void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public final String getLocation() {
		return location;
	}

	public final void setLocation(String string) {
		location = string;
	}

	public final String getEmail() {
		return email;
	}

	public final void setEmail(String email) {
		this.email = email;
	}

	public final int getEmploymentType() {
		return employmentType;
	}

	public final void setEmploymentType(int employementType) {
		this.employmentType = employementType;
	}

	public final int getEmpStatus() {
		return empStatus;
	}

	public final void setEmpStatus(int empStatus) {
		this.empStatus = empStatus;
	}

	public final String getFullName() {
		return empName;
	}

	public final String getParam1() {
		return param1;
	}

	public final void setParam1(String param1) {
		this.param1 = param1;
	}

	public final String getParam2() {
		return param2;
	}

	public final void setParam2(String param2) {
		this.param2 = param2;
	}

	public final String getParam3() {
		return param3;
	}

	public final void setParam3(String param3) {
		this.param3 = param3;
	}
	
	public final String getUserName() {
		return userName;
	}

	public final void setUserName(String userName) {
		this.userName = userName;
	}
	
	public final String getUserDateFormat() {
		return userDateFormat;
	}

	public final void setUserDateFormat(String userDateFormat) {
		this.userDateFormat = userDateFormat;
	}

	public boolean isRoleSupported(String roleClass) {
		return false;
	}

	public final long getLastUpdatedTimestamp() {
		return lastUpdatedTimestamp;
	}

	public final void setLastUpdatedTimestamp(long lastUpdatedTimestamp) {
		this.lastUpdatedTimestamp = lastUpdatedTimestamp;
	}

	public String getLangPref() {
		return langPref;
	}

	public void setLangPref(String langPref) {
		this.langPref = langPref;
	}

}

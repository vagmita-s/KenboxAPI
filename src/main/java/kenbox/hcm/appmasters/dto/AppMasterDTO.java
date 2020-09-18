package kenbox.hcm.appmasters.dto;

import kenbox.core.util.BaseDTO;

public class AppMasterDTO extends BaseDTO{
	private int appMasterId;
	private String appMasterName;
	private String appMasterType;
	private String description;
	
	public int getAppMasterId() {
		return appMasterId;
	}
	public void setAppMasterId(int appMasterId) {
		this.appMasterId = appMasterId;
	}
	public String getAppMasterName() {
		return appMasterName;
	}
	public void setAppMasterName(String appMasterName) {
		this.appMasterName = appMasterName;
	}
	public String getAppMasterType() {
		return appMasterType;
	}
	public void setAppMasterType(String appMasterType) {
		this.appMasterType = appMasterType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}

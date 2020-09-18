package kenbox.core.util;

import kenbox.core.db.BaseDao;



public  class BaseDTO{
	
	private int companyId;
	private String createdOn;
	private int createdBy;
	private long luts;
	
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public void copyDAOToBaseTeo(BaseDao daoFrom, UserDTO loginUser) {
		if(loginUser != null && daoFrom.createdOn != null){
		}
		setCompanyId(daoFrom.companyId);
		setCreatedBy(daoFrom.createdBy);
		setLuts(daoFrom.luts);
	}
	public final  String getCreatedOn() {
		return createdOn;
	}
	public final void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	public final int getCreatedBy() {
		return createdBy;
	}
	public final void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public final long getLuts() {
		return luts;
	}
	public final void setLuts(long luts) {
		this.luts = luts;
	}
}

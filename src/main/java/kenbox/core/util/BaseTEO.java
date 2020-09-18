package kenbox.core.util;

import kenbox.core.db.BaseDao;



public abstract class BaseTEO{

	public BaseTEO() {
		
	}
	public BaseTEO(BaseTEO baseTeo) {
		tenantId = baseTeo.tenantId;
		createdOn = baseTeo.createdOn;
		createdBy = baseTeo.createdBy;
	}
	
	private int tenantId;
	private String createdOn;
	private int createdBy;
	private long luts;
	
	
	public final int getTenantId() {
		return tenantId;
	}
	public final void setTenantId(int tenantId) {
		this.tenantId = tenantId;
	}
	
	public void copyDAOToBaseTeo(BaseDao daoFrom, UserTEO loginUser) {
		if(loginUser != null && daoFrom.createdOn != null){
			//setCreatedOn(UtilHelper.formatDateToString(daoFrom.createdOn, loginUser));
		}
		setTenantId(daoFrom.companyId);
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

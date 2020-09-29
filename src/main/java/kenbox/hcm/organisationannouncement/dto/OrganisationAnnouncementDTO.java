package kenbox.hcm.organisationannouncement.dto;

import java.util.Date;

import kenbox.core.util.BaseDTO;

public class OrganisationAnnouncementDTO extends BaseDTO{
	
	public String id;
	  public String creator;
	  public String announcementId;
	  
	  public String announcement;
	  public Date announcementDate;
	  public String subject;
	  public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String startTime;

	  public String venue;

	  public String expiry;    
	  public String location;
	  
	
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = "Admin";
	}
	public String getAnnouncementId() {
		return announcementId;
	}
	public void setAnnouncementId(String announcementId) {
		this.announcementId = announcementId;
	}
	public String getAnnouncement() {
		return announcement;
	}
	public void setAnnouncement(String announcement) {
		this.announcement = announcement;
	}
	
	public Date getAnnouncementDate() {
		return announcementDate;
	}
	public void setAnnouncementDate(Date announcementDate) {
		this.announcementDate = announcementDate;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getExpiry() {
		return expiry;
	}
	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
}

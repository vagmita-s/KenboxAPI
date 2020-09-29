package kenbox.hcm.organisationannouncement.dao;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import kenbox.core.db.BaseDao;

@Document("ORGANISATIONANNOUNCEMENT")
public class DaoOrganisationAnnouncement extends BaseDao{
	  @Id
	  public String id;
	  public String creator;
	  public String announcementId;
	  public String subject;
	  public String announcement;
	  public Date announcementDate;
	  public String startTime;
	  public String venue;
	  public String expiry;    
	  public String location;


}

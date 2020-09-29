package kenbox.hcm.user.documents.dao;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import kenbox.core.db.BaseDao;

@Document("DOCUMENT")
public class DaoDocument extends BaseDao{
	
	@Id
 	public String id;
  	public int empId;
  	public String documentType;
  	public String nameOfDocument;
  	public String attachmentOption;
  	public String comments;
}

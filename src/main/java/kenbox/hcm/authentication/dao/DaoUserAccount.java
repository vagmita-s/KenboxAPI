package kenbox.hcm.authentication.dao;

import org.bson.types.Binary;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import kenbox.core.db.BaseDao;

@Document("USERACCOUNT")
public class DaoUserAccount extends BaseDao{
	@Id
	public String id;
	public String userName;
	public String password;
	public long token;
	public long tokenCreationDate;
	public Binary image;
	
	public Binary getImage() {
		return image;
	}
	public void setImage(Binary image) {
		this.image = image;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
}

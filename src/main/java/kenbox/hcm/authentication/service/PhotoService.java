package kenbox.hcm.authentication.service;

import java.io.IOException;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kenbox.hcm.authentication.dao.DaoUserAccount;
import kenbox.hcm.authentication.qo.UserAccountRepository;
import kenbox.hcm.company.dao.DaoCompany;
import kenbox.hcm.company.qo.CompanyRepository;

@Service
public class PhotoService {
 
    
    
    @Autowired
	private UserAccountRepository userRepository;
	@Autowired CompanyRepository companyRepository;
 
    public String addPhoto(String email, String company, MultipartFile image) throws IOException { 
    	
    	DaoCompany daoCompany = companyRepository.findCompanyByCompanyName(company);
		int companyId = daoCompany.companyId;
		DaoUserAccount daoUserAccount = userRepository.findByUserName(email,companyId);
		if(daoUserAccount != null) {
			
					
			 DaoUserAccount photo = new DaoUserAccount();	       
			 daoUserAccount.setImage(new Binary(BsonBinarySubType.BINARY,
			 image.getBytes()));
			 photo = userRepository.save(photo);
			 daoUserAccount.userName=email;
			 userRepository.save(daoUserAccount);
			 
			/* 
			 ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
		     MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
			 daoUserAccount = mongoOperation.findOne( new
			 Query(Criteria.where("email").is(email)), DaoUserAccount.class);
			 daoUserAccount.userName=email;
			 image=daoUserAccount.save(image);
			 userRepository.save(daoUserAccount);
			*/ 
			
	        
	        
	        return photo.getUserName();
			
		}else {
			return "Invalid email id.";
		}
		
    	
    	
        
    }
 
    public DaoUserAccount getPhoto(String email) { 
        return userRepository.findById(email).get(); 
    }

}
package kenbox.hcm.authentication.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kenbox.hcm.authentication.dao.DaoUserAccount;
import kenbox.hcm.authentication.qo.UserAccountRepository;
import kenbox.hcm.company.dao.DaoCompany;
import kenbox.hcm.company.qo.CompanyRepository;


@Service
public class UserService {
	

	@Autowired
	private UserAccountRepository userRepository;
	@Autowired CompanyRepository companyRepository;


	public String forgotPassword(String email,String  company) {
		DaoCompany daoCompany = companyRepository.findCompanyByCompanyName(company);
		int companyId = daoCompany.companyId;
		DaoUserAccount daoUserAccount = userRepository.findByUserName(email,companyId);
		if(daoUserAccount != null) {
			
			long token = System.currentTimeMillis();
			// Here we need to update above token to DaoUserAccount Table W.r.t given email.
			daoUserAccount.token=token;
			daoUserAccount.userName=email;
			daoUserAccount.tokenCreationDate=token;
			userRepository.save(daoUserAccount);
			
			return String.valueOf(token);
		}else {
			return "Invalid email id 123.";
		}

		
	}

	public String resetPassword(long token, String password) {

		DaoUserAccount daoUserAccount = userRepository.findByToken(token);
		if(daoUserAccount != null) {
			daoUserAccount.password=password;
			userRepository.save(daoUserAccount);
			return "Your password successfully updated.";
		}else {
			return "Invalid request";
		}

		
	}
}

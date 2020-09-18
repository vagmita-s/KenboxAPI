package kenbox.hcm.authentication.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import kenbox.hcm.authentication.dao.DaoUserAccount;
import kenbox.hcm.authentication.qo.UserAccountRepository;
import kenbox.hcm.company.dao.DaoCompany;
import kenbox.hcm.company.qo.CompanyRepository;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired UserAccountRepository userAccountRepository;
	
	@Autowired CompanyRepository companyRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException 
	{
		String[] userNameForCompany = StringUtils.split(userName, String.valueOf(Character.LINE_SEPARATOR));
		if (userNameForCompany == null || userNameForCompany.length != 2) {
            throw new UsernameNotFoundException("Username and company must be provided");
        }
		System.out.println("input userName :: "+userNameForCompany[0] + "and company :: "+userNameForCompany[1]);
		DaoCompany daoCompany = companyRepository.findCompanyByCompanyName(userNameForCompany[1]);
		int companyId = daoCompany.companyId;
		DaoUserAccount userAccount = userAccountRepository.findByUserName(userNameForCompany[0],companyId);
		if(userAccount != null) {
			System.out.println("success from database userName :: "+userName);
			return new User(userName, userAccount.password,new ArrayList<>());
			/*UserAccountDTO user = new UserAccountDTO();
			user.setCompanyId(userAccount.companyId);
			user.setUserName(userAccount.userName);
			return new JwtUserDetails(user);*/
		}else {
			System.out.println("userName login fail :: "+userName);
			throw new UsernameNotFoundException("User not found with username: " + userName);
		}
	}

}

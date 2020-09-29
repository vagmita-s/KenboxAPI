package kenbox.core.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.StringUtils;

import kenbox.core.util.UserDTO;
import kenbox.hcm.employee.dao.DaoEmployee;
import kenbox.hcm.employee.qo.EmployeeRepository;
import kenbox.hcm.company.dao.DaoCompany;
import kenbox.hcm.company.qo.CompanyRepository;

public class AppController {
	@Autowired CompanyRepository companyRepository;
	@Autowired EmployeeRepository employeeRepository;
	
	public UserDTO getLoginUser() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if(authentication != null) {
			String userName = authentication.getName();
			String[] userNameForCompany = userName.split(String.valueOf(Character.LINE_SEPARATOR));//StringUtils.split(userName, String.valueOf(Character.LINE_SEPARATOR));
			DaoCompany daoAppCompany = companyRepository.findCompanyByCompanyName(userNameForCompany[2]);
			int companyId = daoAppCompany.companyId;
			DaoEmployee daoEmployee = employeeRepository.findByUserName(userNameForCompany[0] , companyId);
			UserDTO userDTO = new UserDTO();
			userDTO.setFirstName(daoEmployee.firstName);
			userDTO.setMiddleName(daoEmployee.middleName);
			userDTO.setLastName(daoEmployee.lastName);
			userDTO.setEmpId(daoEmployee.empId);
			userDTO.setEmail(daoEmployee.email);
			userDTO.setUserName(daoEmployee.userName);
			userDTO.setCompanyId(daoEmployee.companyId);
			//BeanUtils.copyProperties(daoEmployee, userTeo);
			return userDTO;
		}
		return null;
	}
}

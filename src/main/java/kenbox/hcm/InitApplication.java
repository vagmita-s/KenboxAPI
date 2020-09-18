package kenbox.hcm;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import kenbox.hcm.employee.dao.DaoEmployee;
import kenbox.hcm.employee.qo.EmployeeRepository;
import kenbox.hcm.appmasters.dao.DaoAppMaster;
import kenbox.hcm.appmasters.qo.AppMasterRepository;
import kenbox.hcm.authentication.dao.DaoUserAccount;
import kenbox.hcm.authentication.qo.UserAccountRepository;
import kenbox.hcm.company.dao.DaoCompany;
import kenbox.hcm.company.qo.CompanyRepository;

@SpringBootApplication
@CrossOrigin("http://localhost:3000")
public class InitApplication implements CommandLineRunner{
	@Autowired CompanyRepository companyRepository;
	@Autowired UserAccountRepository userAccountRepository;

	@Autowired EmployeeRepository employeeRepository;
	@Autowired AppMasterRepository appMasterRepository;
	public static void main(String[] args) {		
		SpringApplication.run(InitApplication.class, args);
	}
	@Override
    public void run(String... args) throws Exception {
		/*int attributeId = 1;
		DaoAppMaster daoAppMaster = new DaoAppMaster();
		DaoAppMaster exitMaster = appMasterRepository.getMaxAppMasterIdByType("gender", 1001);
		if(exitMaster != null)
			attributeId = attributeId + exitMaster.appMasterId;
		daoAppMaster.appMasterId = attributeId;
		daoAppMaster.appMasterName = "Male";
		daoAppMaster.appMasterType = "gender";
		daoAppMaster.createdBy =1;
		daoAppMaster.companyId = 1001;
		daoAppMaster.createdOn = new Date();
		daoAppMaster.luts = System.currentTimeMillis();
		appMasterRepository.save(daoAppMaster);
		exitMaster = appMasterRepository.getMaxAppMasterIdByType("gender", 1001);
		if(exitMaster != null)
			attributeId = attributeId + exitMaster.appMasterId;
		daoAppMaster = new DaoAppMaster();
		daoAppMaster.appMasterId = attributeId;
		daoAppMaster.appMasterName = "Female";
		daoAppMaster.appMasterType = "gender";
		daoAppMaster.createdBy =1;
		daoAppMaster.companyId = 1001;
		daoAppMaster.createdOn = new Date();
		daoAppMaster.luts = System.currentTimeMillis();
		appMasterRepository.save(daoAppMaster);*/
		/*
		DaoCompany daoCompany = new DaoCompany();
		daoCompany.companyId = 1;
		daoCompany.companyName = "kenbox";
		daoCompany.createdBy =1;
		daoCompany.createdOn = new Date();
		daoCompany.status = 0;
		daoCompany.luts = System.currentTimeMillis();
		companyRepository.save(daoCompany);
		daoCompany = new DaoCompany();
		daoCompany.companyId = 1001;
		daoCompany.companyName = "local";
		daoCompany.createdBy =1;
		daoCompany.createdOn = new Date();
		daoCompany.status = 0;
		daoCompany.luts = System.currentTimeMillis();
		companyRepository.save(daoCompany);
		
		
		DaoUserAccount daoUser = new DaoUserAccount();
		daoUser.companyId = 1001;
		daoUser.userName = "admin";
		daoUser.password = "admin";
		
		userAccountRepository.save(daoUser);
		
		DaoEmployee daoEmployee = new DaoEmployee();
		daoEmployee.empId =1001;
		daoEmployee.firstName = "Atulya";
		daoEmployee.middleName = "kumar";
		daoEmployee.lastName = "Das";
		daoEmployee.email = "akdas.pali@gmail.com";
		daoEmployee.userName = "akdas.pali@gmail.com";
		daoEmployee.empStatus = 1;
		daoEmployee.createdBy =1;
		daoEmployee.companyId = 1001;
		daoEmployee.createdOn = new Date();
		daoEmployee.luts = System.currentTimeMillis();
		employeeRepository.save(daoEmployee);
		daoEmployee = new DaoEmployee();
		daoEmployee.empId =1002;
		daoEmployee.firstName = "Ram";
		daoEmployee.middleName = "kumar";
		daoEmployee.lastName = "Singh";
		daoEmployee.email = "ram.pali@gmail.com";
		daoEmployee.userName = "ram.pali@gmail.com";
		daoEmployee.empStatus = 1;
		daoEmployee.createdBy =1;
		daoEmployee.companyId = 1001;
		daoEmployee.createdOn = new Date();
		daoEmployee.luts = System.currentTimeMillis();
		employeeRepository.save(daoEmployee);
		 daoEmployee = new DaoEmployee();
		daoEmployee.empId =1003;
		daoEmployee.firstName = "Tom";
		daoEmployee.middleName = "t";
		daoEmployee.lastName = "Harris";
		daoEmployee.email = "tom.t@gmail.com";
		daoEmployee.userName = "tom.t@gmail.com";
		daoEmployee.empStatus = 1;
		daoEmployee.createdBy =1;
		daoEmployee.companyId = 1001;
		daoEmployee.createdOn = new Date();
		daoEmployee.luts = System.currentTimeMillis();
		employeeRepository.save(daoEmployee);
		 daoEmployee = new DaoEmployee();
		daoEmployee.empId =1;
		daoEmployee.firstName = "System";
		daoEmployee.middleName = "";
		daoEmployee.lastName = "Admin";
		daoEmployee.email = "system.admin@gmail.com";
		daoEmployee.userName = "system.admin@gmail.com";
		daoEmployee.empStatus = 0;
		daoEmployee.createdBy =1;
		daoEmployee.companyId = 1;
		daoEmployee.createdOn = new Date();
		daoEmployee.luts = System.currentTimeMillis();
		employeeRepository.save(daoEmployee);
		*/
	}
}

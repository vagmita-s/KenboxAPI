package kenbox.hcm;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import kenbox.hcm.appmasters.dao.DaoAppMaster;
import kenbox.hcm.appmasters.qo.AppMasterRepository;
import kenbox.hcm.authentication.qo.UserAccountRepository;
import kenbox.hcm.company.qo.CompanyRepository;
import kenbox.hcm.employee.qo.EmployeeRepository;
import kenbox.hcm.tenant.dao.DaoTableSequences;
import kenbox.hcm.tenant.qo.TableSequenceRepository;

@SpringBootApplication
@CrossOrigin("http://localhost:3000")
public class InitApplication implements CommandLineRunner{
	@Autowired CompanyRepository companyRepository;
	@Autowired UserAccountRepository userAccountRepository;
	@Autowired TableSequenceRepository tableSequenceRepository;
	@Autowired EmployeeRepository employeeRepository;
	@Autowired AppMasterRepository appMasterRepository;
	public static void main(String[] args) {		
		SpringApplication.run(InitApplication.class, args);
	}
	@Override
    public void run(String... args) throws Exception {
		/*
		DaoTableSequences daoTableSequences = new DaoTableSequences();
		daoTableSequences.tableName = "APPMASTER";
		daoTableSequences.nextSeq = 1;
		daoTableSequences.companyId = 1001;
		tableSequenceRepository.save(daoTableSequences);
		
		 
		
		
		DaoAppMaster daoAppMaster = new DaoAppMaster();
		DaoTableSequences daoTableSequences2 =  tableSequenceRepository.findByTableName("APPMASTER", 1001);
		daoAppMaster.appMasterId = daoTableSequences2.nextSeq;
		daoAppMaster.appMasterName = "Male";
		daoAppMaster.appMasterType = "gender";
		daoAppMaster.createdBy =1;
		daoAppMaster.companyId = 1001;
		daoAppMaster.createdOn = new Date();
		daoAppMaster.luts = System.currentTimeMillis();
		appMasterRepository.save(daoAppMaster);
		
		daoTableSequences = new DaoTableSequences();
		daoTableSequences.tableName = "APPMASTER";
		daoTableSequences.nextSeq = daoTableSequences2.nextSeq +1;
		daoTableSequences.companyId = 1001;
		tableSequenceRepository.save(daoTableSequences);
		
		
		DaoTableSequences daoTableSequences3 =  tableSequenceRepository.findByTableName("APPMASTER", 1001);
		daoAppMaster.appMasterId = daoTableSequences3.nextSeq ;
		daoAppMaster.appMasterName = "Female";
		daoAppMaster.appMasterType = "gender";
		daoAppMaster.createdBy =1;
		daoAppMaster.companyId = 1001;
		daoAppMaster.createdOn = new Date();
		daoAppMaster.luts = System.currentTimeMillis();
		appMasterRepository.save(daoAppMaster);
		*/
		
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
		
		*/
		/*
		DaoUserAccount daoUser = new DaoUserAccount();
		daoUser.companyId = 1001;
		daoUser.userName = "admin";
		daoUser.password = "admin";		
		userAccountRepository.save(daoUser);
		
		daoUser = new DaoUserAccount();
		daoUser.companyId = 1001;
		daoUser.userName = "ram.pali@gmail.com";
		daoUser.password = "admin";		
		userAccountRepository.save(daoUser);
		
		daoUser = new DaoUserAccount();
		daoUser.companyId = 1001;
		daoUser.userName = "tom.t@gmail.com";
		daoUser.password = "admin";		
		userAccountRepository.save(daoUser);
		
		DaoUserAccount daoUser = new DaoUserAccount();
		daoUser = new DaoUserAccount();
		daoUser.companyId = 1001;
		daoUser.userName = "akdas.pali@gmail.com";
		daoUser.password = "admin";		
		userAccountRepository.save(daoUser);
		*/
	

		
		/*
		DaoEmployee daoEmployee = new DaoEmployee();
		daoEmployee.empId =1001;
		daoEmployee.firstName = "Atulya";
		daoEmployee.middleName = "kumar";
		daoEmployee.lastName = "Das";
		daoEmployee.email = "akdas.pali@gmail.com";
		daoEmployee.userName = "akdas.pali@gmail.com";
		daoEmployee.title = "Mr.";
		daoEmployee.dateOfBirth = "01-01-1980";
		daoEmployee.contactNumber = "8676561238";
		daoEmployee.band = "50k";
		daoEmployee.grade= "50k";
		daoEmployee.designation= "System Architect";
		daoEmployee.reportingManager= "XYZ Singh";
		daoEmployee.hrManager= "ABC Kapoor";
		daoEmployee.dateOfJoin= "01-01-2015";
		daoEmployee.groupDateOfJoining = "01-01-2015";
		daoEmployee.companyName = "Kenbox";
		daoEmployee.entity= "xyz";
		daoEmployee.department= "Software Development";
		daoEmployee.employmentType= "Permanent";
		daoEmployee.tenureOfCompany= "5 years";
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
		daoEmployee.title = "Mr.";
		daoEmployee.dateOfBirth = "01-01-1980";
		daoEmployee.contactNumber = "4362801836";
		daoEmployee.band = "40k";
		daoEmployee.grade= "35k";
		daoEmployee.designation= "Web Developer";
		daoEmployee.reportingManager= "XYZ Sharma";
		daoEmployee.hrManager= "ABC Kapoor";
		daoEmployee.dateOfJoin= "01-08-2015";
		daoEmployee.groupDateOfJoining = "01-08-2015";
		daoEmployee.companyName = "Kenbox";
		daoEmployee.entity= "abc";
		daoEmployee.department= "Software Development";
		daoEmployee.employmentType= "Permanent";
		daoEmployee.tenureOfCompany= "3 years";
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
		daoEmployee.title = "Mr.";
		daoEmployee.dateOfBirth = "01-01-1980";
		daoEmployee.contactNumber = "8654729238";
		daoEmployee.band = "40k";
		daoEmployee.grade= "35k";
		daoEmployee.designation= "Software Developer";
		daoEmployee.reportingManager= "KLM Singh";
		daoEmployee.hrManager= "ABC Kapoor";
		daoEmployee.dateOfJoin= "01-08-2015";
		daoEmployee.groupDateOfJoining = "01-08-2015";
		daoEmployee.companyName = "Kenbox";
		daoEmployee.entity= "abc";
		daoEmployee.department= "Software Development";
		daoEmployee.employmentType= "Permanent";
		daoEmployee.tenureOfCompany= "10years";
		daoEmployee.empStatus = 1;
		daoEmployee.createdBy =1;
		daoEmployee.companyId = 1001;
		daoEmployee.createdOn = new Date();
		daoEmployee.luts = System.currentTimeMillis();
		employeeRepository.save(daoEmployee);
		*/
		
		/*
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
		employeeRepository.save(daoEmployee);*/
		
	}
}

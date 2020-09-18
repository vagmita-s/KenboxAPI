package kenbox.core.security;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import kenbox.core.util.UserTEO;
import kenbox.hcm.employee.dao.DaoEmployee;
import kenbox.hcm.employee.qo.EmployeeRepository;
import kenbox.hcm.tenant.dao.DaoAppTenant;
import kenbox.hcm.tenant.qo.AppTenantRepository;
@Service
public class KenboxSecurityManager {
	
	@Autowired AppTenantRepository appTenantRepository;
	
	@Autowired EmployeeRepository employeeRepository;
	
	private static KenboxSecurityManager instance = null;
	public static  Class securityManagerClass     = null;

	protected KenboxSecurityManager() {
	}

	public static KenboxSecurityManager getInstance(){
		if(instance == null) {
			if(securityManagerClass == null)
			  instance = new KenboxSecurityManager();
			else
				try{
				  instance = (KenboxSecurityManager) securityManagerClass.newInstance();
				}catch(Exception e){
					e.printStackTrace();
				}
		}
		return instance;
	}

	public UserTEO getLoginUser() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if(authentication != null) {
			String userName = authentication.getName();
			String[] userNameForTenant = StringUtils.split(userName, String.valueOf(Character.LINE_SEPARATOR));
			DaoAppTenant daoAppTenant = appTenantRepository.findTenantByTenantName(userNameForTenant[1]);
			int tenantId = daoAppTenant.tenantId;
			DaoEmployee daoEmployee = employeeRepository.findByUserName(userNameForTenant[0] , tenantId);
			UserTEO userTeo = new UserTEO();
			BeanUtils.copyProperties(daoEmployee, userTeo);
			return userTeo;
		}
		return null;
		
		


	}
}

package kenbox.core.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import kenbox.hcm.tenant.dao.DaoTableSequences;
import kenbox.hcm.tenant.qo.TableSequenceRepository;
@Service
@Component
public class PrimaryIdGenerator {
	
	@Autowired TableSequenceRepository tableSequenceRepository;
	
	private static PrimaryIdGenerator instance = null;
	public static PrimaryIdGenerator getInstance() {
		if(instance == null)
			instance =  new PrimaryIdGenerator();
		return instance;
	}
	
	public int getPrimaryIdForTable(String tableName, UserDTO loginUser) {
		int id = -1;
		DaoTableSequences daoTableSequences = tableSequenceRepository.findByTableName(tableName,loginUser.getCompanyId());
		if(daoTableSequences != null) {
			id = daoTableSequences.nextSeq;
			//code to update the value of	table sequences for the tablename appMaster
			daoTableSequences.nextSeq = id +1;
			tableSequenceRepository.save(daoTableSequences);
		}
		
	  return id ;	
		
	}

}

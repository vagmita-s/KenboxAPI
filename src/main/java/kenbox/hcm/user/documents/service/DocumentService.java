package kenbox.hcm.user.documents.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kenbox.hcm.user.documents.dao.DaoDocument;
import kenbox.hcm.user.documents.dto.DocumentDTO;
import kenbox.hcm.user.documents.qo.DocumentRepository;



@Service
public class DocumentService {

	@Autowired DocumentRepository documentRepository;
	
	public DocumentDTO getById(int empId, int companyId) {
		
		DocumentDTO teo = copyDaoToTeo(documentRepository.findByEmpId(empId, companyId));
		return teo;
	}
	
	private DocumentDTO copyDaoToTeo(DaoDocument dao) {
		DocumentDTO teo = new DocumentDTO();
		BeanUtils.copyProperties(dao, teo);
		return teo;
	}
	
}

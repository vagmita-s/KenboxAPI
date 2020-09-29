package kenbox.hcm.organisationannouncement.qo;

import java.util.List;

import kenbox.core.db.BaseDBRepository;
import kenbox.hcm.employee.dao.DaoEmployee;
import kenbox.hcm.organisationannouncement.dao.DaoOrganisationAnnouncement;

public interface OrganisationAnnouncementRepository extends BaseDBRepository<DaoOrganisationAnnouncement> { 
	public List<DaoOrganisationAnnouncement> findByCompanyId(int companyId);
	
}

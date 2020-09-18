package kenbox.core.db;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BaseDBRepository <T> extends MongoRepository<T, String>{
	public List<T> findByCompanyId(int companyId);
}

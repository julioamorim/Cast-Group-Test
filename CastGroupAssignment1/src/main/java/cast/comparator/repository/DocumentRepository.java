package cast.comparator.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cast.comparator.entity.Document;

@Repository
public interface DocumentRepository extends CrudRepository<Document, Long> {

	/**
	 * 
	 * Method will find the document by its ID.
	 *
	 * @author jclamorim
	 * @param id
	 * @return Document
	 */
	Document findById(long id);
}
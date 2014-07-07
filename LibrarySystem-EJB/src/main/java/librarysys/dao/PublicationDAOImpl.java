package librarysys.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import librarysys.dao.interfaces.PublicationDAO;
import librarysys.entities.Publication;

@Repository
public class PublicationDAOImpl extends AbstractDAOImpl<Publication, Integer> implements PublicationDAO{

	public Publication getByPrimaryKey(Integer key) {
		return (Publication) getCurrentSession().load(Publication.class, key);
	}

	@SuppressWarnings("unchecked")
	public List<Publication> getAll() {
		return (List<Publication>) getCurrentSession().createCriteria(Publication.class).list();
	}

}

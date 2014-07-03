package librarysys.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import librarysys.dao.interfaces.PublicationDAO;
import librarysys.entities.Publication;

@Repository
public class PublicationDAOImpl extends AbstractDAOImpl<Publication, Integer> implements PublicationDAO{

	public Publication getByPrimaryKey(Integer key) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Publication> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

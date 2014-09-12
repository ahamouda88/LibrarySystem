package librarysys.dao;

import org.springframework.stereotype.Repository;

import librarysys.dao.interfaces.PublicationDAO;
import librarysys.entities.Publication;

@Repository
public class PublicationDAOImpl extends AbstractDAOImpl<Publication, Integer> implements PublicationDAO{

	public PublicationDAOImpl(){
		super(Publication.class);
	}

}

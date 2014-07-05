package librarysys.managers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import librarysys.dao.interfaces.PublicationDAO;
import librarysys.entities.Publication;
import librarysys.managers.interfaces.PublicationManager;

@Service
@Transactional
public class PublicationManagerImpl implements PublicationManager{

	@Autowired
	private PublicationDAO publicationDAO;

	public Publication getByPrimaryKey(Integer key) {
		return publicationDAO.getByPrimaryKey(key);
	}

	public List<Publication> getAll() {
		return publicationDAO.getAll();
	}

	public void save(Publication entity) {
		publicationDAO.save(entity);
	}

	public void remove(Publication entity) {
		publicationDAO.remove(entity);
	}

	public void update(Publication entity) {
		publicationDAO.update(entity);
	}
}

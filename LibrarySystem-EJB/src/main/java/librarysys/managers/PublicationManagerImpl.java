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
		// TODO Auto-generated method stub
		return null;
	}

	public List<Publication> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Publication entity) {
		// TODO Auto-generated method stub
		
	}

	public void remove(Publication entity) {
		// TODO Auto-generated method stub
		
	}

	public void update(Publication entity) {
		// TODO Auto-generated method stub
		
	}
}

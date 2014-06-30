package librarysys.managers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import librarysys.dao.interfaces.PublicationDAO;
import librarysys.entities.Publication;
import librarysys.managers.interfaces.PublicationManager;

@Service
public class PublicationManagerImpl extends AbstractManagerImpl<Publication, Integer> implements PublicationManager{

	@Autowired
	private PublicationDAO publicationDAO;
}

package librarysys.managers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import librarysys.dao.interfaces.PublicationDAO;
import librarysys.entities.Publication;
import librarysys.managers.interfaces.PublicationManager;

@Service
@Transactional
public class PublicationManagerImpl extends AbstractManagerImpl<Publication, Integer> implements PublicationManager{

	@Autowired
	private PublicationDAO publicationDAO;
}

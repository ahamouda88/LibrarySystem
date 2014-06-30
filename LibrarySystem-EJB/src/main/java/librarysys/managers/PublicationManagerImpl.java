package librarysys.managers;

import org.springframework.stereotype.Service;

import librarysys.entities.Publication;
import librarysys.managers.interfaces.PublicationManager;

@Service
public class PublicationManagerImpl extends AbstractManagerImpl<Publication, Integer> implements PublicationManager{

}

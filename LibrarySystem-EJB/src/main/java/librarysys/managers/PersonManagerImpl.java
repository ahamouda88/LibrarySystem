package librarysys.managers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import librarysys.dao.interfaces.PersonDAO;
import librarysys.entities.Person;
import librarysys.managers.interfaces.PersonManager;

@Service
public class PersonManagerImpl extends AbstractManagerImpl<Person, Integer> implements PersonManager{

	@Autowired
	private PersonDAO personDAO;
	
}

package librarysys.managers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import librarysys.dao.interfaces.PersonDAO;
import librarysys.entities.Person;
import librarysys.managers.interfaces.PersonManager;

@Service
@Transactional
public class PersonManagerImpl implements PersonManager{

	@Autowired
	private PersonDAO personDAO;
	
}

package librarysys.managers;

import org.springframework.stereotype.Service;

import librarysys.entities.Person;
import librarysys.managers.interfaces.PersonManager;

@Service
public class PersonManagerImpl extends AbstractManagerImpl<Person, Integer> implements PersonManager{

}

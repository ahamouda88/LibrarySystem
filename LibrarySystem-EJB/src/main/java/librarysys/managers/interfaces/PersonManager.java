package librarysys.managers.interfaces;

import librarysys.entities.Person;

public interface PersonManager extends AbstractManager<Person, Integer>{
	
	public void saveAuthor(Person author);

}

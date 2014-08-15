package librarysys.dao.interfaces;

import librarysys.entities.Person;

public interface PersonDAO extends AbstractDAO<Person, Integer>{

	public void saveAuthor(Person author);
}

package librarysys.dao.interfaces;

import java.util.List;

import librarysys.entities.Person;

public interface PersonDAO {
	public List<Person> getPersons();

	public Person getPerson(int id);

	public boolean savePerson(Person person);

	public boolean updatePerson(Person person);

	public boolean deletePerson(Person person);
}

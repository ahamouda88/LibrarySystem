package librarysys.dao.interfaces;

import java.util.List;

import librarysys.entities.PersonModel;

public interface PersonDAO {
	public List<PersonModel> getPersons();

	public PersonModel getPerson(int id);

	public boolean savePerson(PersonModel person);

	public boolean updatePerson(PersonModel person);

	public boolean deletePerson(PersonModel person);
}

package librarysys.dao;

import java.util.List;

import librarysys.dao.interfaces.PersonDAO;
import librarysys.entities.Person;

public class PersonDAOImpl implements PersonDAO{

	// Inject the entity manager here
	// Make the EJB classes call this DAO to perform CRUD operations
	
	public List<Person> getPersons() {
		// TODO Auto-generated method stub
		return null;
	}

	public Person getPerson(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean savePerson(Person person) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updatePerson(Person person) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deletePerson(Person person) {
		// TODO Auto-generated method stub
		return false;
	}

}

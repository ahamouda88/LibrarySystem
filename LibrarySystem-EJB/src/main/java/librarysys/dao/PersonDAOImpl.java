package librarysys.dao;

import org.springframework.stereotype.Repository;

import librarysys.dao.interfaces.PersonDAO;
import librarysys.entities.Person;

@Repository
public class PersonDAOImpl extends AbstractDAOImpl<Person, Integer> implements PersonDAO{

	public PersonDAOImpl(){
		super(Person.class);
	}
	
	public void saveAuthor(Person author) {
		// Create Address DAO FIRST!!
		// Add address DAO IMPL to this class to use it in the save
	}

}

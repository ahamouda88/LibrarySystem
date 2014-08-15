package librarysys.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import librarysys.dao.interfaces.PersonDAO;
import librarysys.entities.Person;

@Repository
public class PersonDAOImpl extends AbstractDAOImpl<Person, Integer> implements PersonDAO{

	
	public Person getByPrimaryKey(Integer key) {
		return (Person) getCurrentSession().load(Person.class, key);
	}

	@SuppressWarnings("unchecked")
	public List<Person> getAll() {
		return (List<Person>) getCurrentSession().createCriteria(Person.class).list();
	}

	public void saveAuthor(Person author) {
		// Create Address DAO FIRST!!
		// Add address DAO IMPL to this class to use it in the save
	}

}

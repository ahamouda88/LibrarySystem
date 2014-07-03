package librarysys.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import librarysys.dao.interfaces.PersonDAO;
import librarysys.entities.Person;

@Repository
public class PersonDAOImpl extends AbstractDAOImpl<Person, Integer> implements PersonDAO{

	public Person getByPrimaryKey(Integer key) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Person> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

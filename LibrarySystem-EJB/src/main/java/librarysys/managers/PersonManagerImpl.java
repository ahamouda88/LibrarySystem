package librarysys.managers;

import java.util.List;

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

	public Person getByPrimaryKey(Integer key) {
		return personDAO.getByPrimaryKey(key);
	}

	public List<Person> getAll() {
		return personDAO.getAll();
	}

	public void save(Person entity) {
		personDAO.save(entity);
	}

	public void remove(Person entity) {
		personDAO.remove(entity);
	}

	public void update(Person entity) {
		personDAO.update(entity);
	}
	
}

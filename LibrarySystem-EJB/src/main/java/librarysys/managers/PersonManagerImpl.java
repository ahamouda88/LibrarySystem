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
		// TODO Auto-generated method stub
		return null;
	}

	public List<Person> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Person entity) {
		// TODO Auto-generated method stub
		
	}

	public void remove(Person entity) {
		// TODO Auto-generated method stub
		
	}

	public void update(Person entity) {
		// TODO Auto-generated method stub
		
	}
	
}

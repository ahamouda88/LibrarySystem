package librarysys.dao;

import org.springframework.stereotype.Repository;

import librarysys.dao.interfaces.PersonDAO;
import librarysys.entities.Person;

@Repository
public class PersonDAOImpl extends AbstractDAOImpl<Person, Integer> implements PersonDAO{

}

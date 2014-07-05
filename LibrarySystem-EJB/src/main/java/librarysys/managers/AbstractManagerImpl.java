package librarysys.managers;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import librarysys.dao.AbstractDAOImpl;
import librarysys.managers.interfaces.AbstractManager;

// Abstract Manager is not used yet!
//@Service
@Transactional
public abstract class AbstractManagerImpl<T, ID extends Serializable> implements AbstractManager<T, ID>{
	
	@Autowired
	protected AbstractDAOImpl<T, ID> abstractDAO;

	public T getByPrimaryKey(ID key) {
		return abstractDAO.getByPrimaryKey(key);
	}

	public List<T> getAll() {
		return abstractDAO.getAll();
	}

	public void save(T entity) {
		abstractDAO.save(entity);
	}

	public void remove(T entity) {
		abstractDAO.remove(entity);
	}

	public void update(T entity) {
		abstractDAO.update(entity);
	}

}

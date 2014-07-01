package librarysys.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import librarysys.dao.interfaces.AbstractDAO;

@Repository
public abstract class AbstractDAOImpl<T , ID> implements AbstractDAO<T, ID>{
	
	@Autowired
    private SessionFactory sessionFactory;
	
	// TODO Inject the entity manager here
	// Make the EJB classes call this DAO to perform CRUD operations

	public T getByPrimaryKey(ID key) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean presist(T entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean remove(T entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(T entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}

package librarysys.dao;


import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import librarysys.dao.interfaces.AbstractDAO;

@Repository
public abstract class AbstractDAOImpl<T , ID extends Serializable> implements AbstractDAO<T, ID >{
	
	protected Class<T> type;

	public AbstractDAOImpl(Class<T> type){
		this.type = type;
	}
	
	@Autowired
    private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public T getByPrimaryKey(ID key) {
		return (T) getCurrentSession().load(type, key);
	}

	@SuppressWarnings("unchecked")
	public List<T> getAll() {
		return (List<T>) getCurrentSession().createCriteria(type).list();
	}

	public void save(T entity) {
		sessionFactory.getCurrentSession().saveOrUpdate(entity);
	}

	public void remove(T entity) {
		sessionFactory.getCurrentSession().delete(entity);
	}

	public void update(T entity) {
		sessionFactory.getCurrentSession().saveOrUpdate(entity);
	}

	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
}

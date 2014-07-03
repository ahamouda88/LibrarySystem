package librarysys.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import librarysys.dao.interfaces.AbstractDAO;

@Repository
public abstract class AbstractDAOImpl<T , ID> implements AbstractDAO<T, ID>{
	
	@Autowired
    private SessionFactory sessionFactory;

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

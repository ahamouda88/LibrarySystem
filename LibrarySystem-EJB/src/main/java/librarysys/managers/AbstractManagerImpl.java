package librarysys.managers;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import librarysys.managers.interfaces.AbstractManager;

@Service
@Transactional
public abstract class AbstractManagerImpl<T, ID> implements AbstractManager<T, ID>{

	public T getByPrimaryKey(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean presist(Object entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean remove(Object entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(Object entity) {
		// TODO Auto-generated method stub
		return false;
	}

}

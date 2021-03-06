package librarysys.dao.interfaces;

import java.io.Serializable;
import java.util.List;

public interface AbstractDAO<T, ID extends Serializable> {

	public T getByPrimaryKey(ID key);
	
	public List<T> getAll();
	
	public void save(T entity);
	
	public void remove(T entity);
	
	public void update(T entity);
}

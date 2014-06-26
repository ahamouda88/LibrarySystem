package librarysys.dao.interfaces;

import java.util.List;

public interface AbstractDAO<T, ID> {

	public T getByPrimaryKey(ID key);
	
	public List<T> getAll();
	
	public boolean presist(T entity);
	
	public boolean remove(T entity);
	
	public boolean update(T entity);
}

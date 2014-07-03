package librarysys.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import librarysys.dao.interfaces.CopyDAO;
import librarysys.entities.Copy;

@Repository
public class CopyDAOImpl extends AbstractDAOImpl<Copy, Integer> implements CopyDAO{

	public Copy getByPrimaryKey(Integer key) {
		return (Copy) getCurrentSession().load(Copy.class, key);
	}

	@SuppressWarnings("unchecked")
	public List<Copy> getAll() {
		return (List<Copy>) getCurrentSession().createCriteria(Copy.class).list();
	}

}

package librarysys.managers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import librarysys.dao.interfaces.CopyDAO;
import librarysys.entities.Copy;
import librarysys.managers.interfaces.CopyManager;

@Service
@Transactional
public class CopyManagerImpl implements CopyManager{

	@Autowired
	private CopyDAO copyDAO;

	public Copy getByPrimaryKey(Integer key) {
		return copyDAO.getByPrimaryKey(key);
	}

	public List<Copy> getAll() {
		return copyDAO.getAll();
	}

	public void save(Copy entity) {
		copyDAO.save(entity);
	}

	public void remove(Copy entity) {
		copyDAO.remove(entity);
	}

	public void update(Copy entity) {
		copyDAO.update(entity);
	}
}

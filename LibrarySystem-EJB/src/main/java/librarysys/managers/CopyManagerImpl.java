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
		// TODO Auto-generated method stub
		return null;
	}

	public List<Copy> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Copy entity) {
		// TODO Auto-generated method stub
		
	}

	public void remove(Copy entity) {
		// TODO Auto-generated method stub
		
	}

	public void update(Copy entity) {
		// TODO Auto-generated method stub
		
	}
}

package librarysys.managers;

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
}

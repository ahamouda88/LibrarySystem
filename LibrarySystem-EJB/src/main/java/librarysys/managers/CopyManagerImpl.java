package librarysys.managers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import librarysys.dao.interfaces.CopyDAO;
import librarysys.entities.Copy;
import librarysys.managers.interfaces.CopyManager;

@Service
public class CopyManagerImpl extends AbstractManagerImpl<Copy,Integer> implements CopyManager{

	@Autowired
	private CopyDAO copyDAO;
}

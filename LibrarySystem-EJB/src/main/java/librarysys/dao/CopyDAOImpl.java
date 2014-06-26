package librarysys.dao;

import org.springframework.stereotype.Repository;

import librarysys.dao.interfaces.CopyDAO;
import librarysys.entities.Copy;

@Repository
public class CopyDAOImpl extends AbstractDAOImpl<Copy, Integer> implements CopyDAO{

}

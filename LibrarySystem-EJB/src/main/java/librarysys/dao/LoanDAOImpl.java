package librarysys.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import librarysys.dao.interfaces.LoanDAO;
import librarysys.entities.Loan;

@Repository
public class LoanDAOImpl extends AbstractDAOImpl<Loan, Integer> implements LoanDAO{

	public Loan getByPrimaryKey(Integer key) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Loan> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

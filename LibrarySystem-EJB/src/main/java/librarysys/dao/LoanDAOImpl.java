package librarysys.dao;

import org.springframework.stereotype.Repository;

import librarysys.dao.interfaces.LoanDAO;
import librarysys.entities.Loan;

@Repository
public class LoanDAOImpl extends AbstractDAOImpl<Loan, Integer> implements LoanDAO{

	public LoanDAOImpl(){
		super(Loan.class);
	}

}

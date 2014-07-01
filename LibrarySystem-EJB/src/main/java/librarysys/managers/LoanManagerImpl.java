package librarysys.managers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import librarysys.dao.interfaces.LoanDAO;
import librarysys.entities.Loan;
import librarysys.managers.interfaces.LoanManager;

@Service
@Transactional
public class LoanManagerImpl extends AbstractManagerImpl<Loan, Integer> implements LoanManager{
	
	@Autowired
	private LoanDAO loanDAO;
}

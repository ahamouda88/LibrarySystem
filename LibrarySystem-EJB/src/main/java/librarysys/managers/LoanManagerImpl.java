package librarysys.managers;

import org.springframework.stereotype.Service;

import librarysys.entities.Loan;
import librarysys.managers.interfaces.LoanManager;

@Service
public class LoanManagerImpl extends AbstractManagerImpl<Loan, Integer> implements LoanManager{

}

package librarysys.managers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import librarysys.dao.interfaces.LoanDAO;
import librarysys.entities.Loan;
import librarysys.managers.interfaces.LoanManager;

@Service
@Transactional
public class LoanManagerImpl implements LoanManager{
	
	@Autowired
	private LoanDAO loanDAO;

	public Loan getByPrimaryKey(Integer key) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Loan> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Loan entity) {
		// TODO Auto-generated method stub
		
	}

	public void remove(Loan entity) {
		// TODO Auto-generated method stub
		
	}

	public void update(Loan entity) {
		// TODO Auto-generated method stub
		
	}
}

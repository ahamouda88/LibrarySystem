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
		return loanDAO.getByPrimaryKey(key);
	}

	public List<Loan> getAll() {
		return loanDAO.getAll();
	}

	public void save(Loan entity) {
		loanDAO.save(entity);
	}

	public void remove(Loan entity) {
		loanDAO.remove(entity);
	}

	public void update(Loan entity) {
		loanDAO.update(entity);
	}
}

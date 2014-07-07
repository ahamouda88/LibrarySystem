package librarysys.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import librarysys.dao.interfaces.LoanDAO;
import librarysys.entities.Loan;

@Repository
public class LoanDAOImpl extends AbstractDAOImpl<Loan, Integer> implements LoanDAO{

	public Loan getByPrimaryKey(Integer key) {
		return (Loan) getCurrentSession().load(Loan.class, key);
	}

	@SuppressWarnings("unchecked")
	public List<Loan> getAll() {
		return (List<Loan>) getCurrentSession().createCriteria(Loan.class).list();
	}

}

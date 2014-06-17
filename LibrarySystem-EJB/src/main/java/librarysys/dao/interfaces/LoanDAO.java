package librarysys.dao.interfaces;

import java.util.List;

import librarysys.entities.Loan;

public interface LoanDAO {
	public List<Loan> getLoan();

	public Loan getLoan(int id);

	public boolean saveLoan(Loan loan);

	public boolean updateLoan(Loan loan);

	public boolean deleteLoan(Loan loan);
}

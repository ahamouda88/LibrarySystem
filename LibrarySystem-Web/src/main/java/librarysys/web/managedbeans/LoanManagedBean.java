package librarysys.web.managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import librarysys.entities.Loan;
import librarysys.managers.interfaces.LoanManager;

import org.springframework.beans.factory.annotation.Autowired;

@ManagedBean
@RequestScoped
public class LoanManagedBean {

	@Autowired
	private LoanManager loanManager;
	private Loan loan;
	
	public LoanManagedBean(){
		loan = new Loan();
	}

	public String saveLoan(){
		String page = "";
		loanManager.save(loan);
		return page;
	}
	
	public LoanManager getLoanManager() {
		return loanManager;
	}

	public void setLoanManager(LoanManager loanManager) {
		this.loanManager = loanManager;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}
	
}

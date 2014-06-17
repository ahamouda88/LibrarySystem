package librarysys.entities;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LOAN")
public class Loan {

	@Column(name = "id")
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "checkout_date")
    private Date checkoutDate;
	@Column(name = "return_date")
    private Date returnDate;
	@ManyToOne
	@JoinColumn(name = "member_id")
    private MemberModel memberModel;
	@OneToOne
	@JoinColumn(name = "copy_id")
    private CopyModel copy;

    public Loan() {}
    
    public Loan(MemberModel memberModel, CopyModel copy) {
        this.memberModel = memberModel;
        this.copy = copy;
        Calendar checkout = Calendar.getInstance();
        Date d = checkout.getTime();
        this.checkoutDate = d;
        //copy.setLoan(this);
        //member.addLoan(this);
        //copy.addLoan(this);
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public MemberModel getMemberModel() {
		return memberModel;
	}

	public void setMemberModel(MemberModel memberModel) {
		this.memberModel = memberModel;
	}

	public CopyModel getCopy() {
		return copy;
	}

	public void setCopy(CopyModel copy) {
		this.copy = copy;
	}
    
    

//	public boolean isReturned() {
//        if (this.getReturndate() != null) {
//            return true;
//        } else {
//            return false;
//        }
//    }
}

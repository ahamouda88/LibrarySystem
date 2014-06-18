package librarysys.entities;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "MEMBER")
@PrimaryKeyJoinColumn(name = "member_id", referencedColumnName = "id")
public class Member extends Person {

	@Column(name = "member_no")
    private int member_no;
	@OneToMany(mappedBy = "memberModel")
    private List<Loan> loans = new ArrayList<Loan>();
	// I can change it to unidirectional association
	@OneToMany(mappedBy = "memberModel")
    private List<Reservation> reservations = new ArrayList<Reservation>();

    public Member(){}
    
    public Member(String firstname, String lastname, Address address, int telephone, int memberno) {
        super(firstname, lastname, telephone, address);
        this.member_no = memberno;
    }

	public int getMember_no() {
		return member_no;
	}

	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}

	public List<Loan> getLoans() {
		return loans;
	}

	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

  
}

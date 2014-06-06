package main.java.librarysys.model;

import java.util.*;

import main.java.library.Loan;
import main.java.library.Reservation;

public class MemberModel extends PersonModel {

    private int member_no;
    private List<Loan> loans = new ArrayList<Loan>();;
    private List<Reservation> reservations = new ArrayList<Reservation>();

    public MemberModel(){}
    
    public MemberModel(String firstname, String lastname, AddressModel address, int telephone, int memberno) {
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

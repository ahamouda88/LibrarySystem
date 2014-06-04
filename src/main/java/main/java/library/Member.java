package main.java.library;

import java.util.*;

public class Member extends Person {

    private int member_no;
    private List<Loan> loans;
    private List<Reservation> reservations;

    public Member(String firstname, String lastname, Address address, int telephone, int memberno) {
        super(firstname, lastname, telephone, address);
        loans = new ArrayList<Loan>();
        reservations = new ArrayList<Reservation>();
        this.member_no = memberno;
    }

    public int getMemberno() {
        return this.member_no;
    }

    public void setMemberno(int no) {
        this.member_no = no;
    }

    public void addLoan(Loan l) {
        loans.add(l);
    }
    public void addReservation(Reservation res) {
        reservations.add(res);
    }

    public void loan(Copy c) {
        Loan l = new Loan(this, c);
        c.Loan();
    }

    public void returnit(Copy c) {
        c.returnit();
    }

    public void reserve(Publication pub) {
        Reservation r = new Reservation(this, pub);
    }

    public void cancelReservation(Reservation res) {
        res.cancel();
        //NEWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW
      //  reservations.remove(res);
    }

    public void pickupReservation(Reservation res) {
        res.pickup();
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void getCopiesHistory() {
        for (Loan l : loans) {
            System.out.println(l.getCopy().getPublication().getTitle());
        }
    }
}

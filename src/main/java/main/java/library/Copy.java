package main.java.library;

import java.util.*;

public class Copy {

    private int copyno;
    public String status;
    private Publication pub;
    private Loan loan;
    private Reservation reservation;

    public Copy(int copyno, String status, Publication pub) {
        //   loans = new ArrayList<Loan>();
        this.copyno = copyno;
        this.status = status;
        this.pub = pub;
        pub.addCopy(this);
    }
    // private List<Reservation> reservations;

    /*public void addReservation(Reservation res)
    {
    reservations.add(res);
    }*/
    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public int getCopyno() {
        return this.copyno;
    }

    public void setCopyno(int no) {
        this.copyno = no;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Publication getPublication() {
        return pub;
    }

    public void setPublication(Publication pub) {
        this.pub = pub;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan l) {
        loan = l;
    }

    public void Loan() {
        //this.loan = l;
        this.setStatus("Loaned");
    }

    public void hold() {
        this.setStatus("Onhold");
        pub.getFirstReservation().hold(this);
    }

    public void returnit() {
        Calendar returndate = Calendar.getInstance();
        Date d = returndate.getTime();
        this.loan.setReturndate(d);
        if (pub.hasPendingReservations()) {
            hold();
        } else {
            this.setStatus("Available");
        }
    }
}

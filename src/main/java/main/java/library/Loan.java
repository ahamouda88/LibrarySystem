package main.java.library;

import java.util.*;

import main.java.model.MemberModel;

public class Loan {

    private Date checkoutDate;
    private Date returnDate;
    private MemberModel mem;
    private Copy copy;

    public Loan(MemberModel member, Copy copy) {
        this.mem = member;
        this.copy = copy;
        Calendar checkout = Calendar.getInstance();
        Date d = checkout.getTime();
        this.checkoutDate = d;
        copy.setLoan(this);
        member.addLoan(this);
        //copy.addLoan(this);
    }

    public Date getCheckoutdate() {
        return this.checkoutDate;
    }

    public void setCheckoutdate(Date checkoutdate) {
        this.checkoutDate = checkoutdate;
    }

    public Date getReturndate() {
        return this.returnDate;
    }

    public void setReturndate(Date returndate) {
        this.returnDate = returndate;
    }

    public Copy getCopy() {
        return copy;
    }

    public void setCopy(Copy copy) {
        this.copy = copy;
    }

    public MemberModel getMember() {
        return mem;
    }

    public void setMember(MemberModel mem) {
        this.mem = mem;
    }

    public boolean isReturned() {
        if (this.getReturndate() != null) {
            return true;
        } else {
            return false;
        }
    }
}

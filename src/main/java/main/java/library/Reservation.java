package main.java.library;

import java.util.*;

public class Reservation {

    private Date statusDate;
    private Member member;
    private Publication publication;
    private Copy copy;
    private String status;
    //public enum Statusenum{Canceled,OnHold,Pending};
    //private Statusenum status;

    public Reservation(Member m, Publication pub) {
        this.member = m;
        this.publication = pub;
        this.setStatus("Pending");
        Calendar statusdate = Calendar.getInstance();
        Date d = statusdate.getTime();
        this.statusDate = d;
        pub.addReservation(this);
        m.addReservation(this);
// NEWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWw
        for (Copy c : publication.getCopies()) {
            if (c.getStatus().equals("Available")) {
                System.out.println(c.getStatus());
                c.hold();
                System.out.println(c.getStatus());
            }
        }
// NEWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWw
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }

    public void cancel() {
        if (!this.getStatus().equals("Fulfilled")) {
            this.setStatus("Canceled");
            Calendar statusdate = Calendar.getInstance();
            Date d = statusdate.getTime();
            this.setStatusDate(d);
            //this.publication.getAllReservations().remove(this);
            // NEWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWw
            if (this.copy != null) {
                this.copy.setStatus("Available");
            }
        }
        // NEWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWw
      /* for (Copy c : publication.getCopies()) {
        if (c.getStatus().equals("Avaiable")) {
        this.copy = c;
        this.copy.setStatus("OnHold");
        }
        }*/
        // NEWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWw
    }

    public void pickup() {
        if (this.getStatus().equals("Onhold")) {
            this.setStatus("Fulfilled");
            Calendar statusdate = Calendar.getInstance();
            Date d = statusdate.getTime();
            this.setStatusDate(d);
            this.member.loan(copy);
        }
    }

    public void hold(Copy c) {
        this.setStatus("Onhold");
        Calendar statusdate = Calendar.getInstance();
        Date d = statusdate.getTime();
        this.setStatusDate(d);
        this.copy = c;
    }
}

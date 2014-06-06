package main.java.library;

import java.util.*;

import main.java.librarysys.model.CopyModel;
import main.java.librarysys.model.MemberModel;
import main.java.librarysys.model.PublicationModel;

public class Reservation {

    private Date statusDate;
    private MemberModel member;
    private PublicationModel publication;
    private CopyModel copy;
    private String status;
    //public enum Statusenum{Canceled,OnHold,Pending};
    //private Statusenum status;

    public Reservation(MemberModel m, PublicationModel pub) {
        this.member = m;
        this.publication = pub;
        this.setStatus("Pending");
        Calendar statusdate = Calendar.getInstance();
        Date d = statusdate.getTime();
        this.statusDate = d;
        pub.addReservation(this);
        m.addReservation(this);
// NEWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWw
        for (CopyModel c : publication.getCopies()) {
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

    public MemberModel getMember() {
        return member;
    }

    public void setMember(MemberModel member) {
        this.member = member;
    }

    public PublicationModel getPublication() {
        return publication;
    }

    public void setPublication(PublicationModel publication) {
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

    public void hold(CopyModel c) {
        this.setStatus("Onhold");
        Calendar statusdate = Calendar.getInstance();
        Date d = statusdate.getTime();
        this.setStatusDate(d);
        this.copy = c;
    }
}

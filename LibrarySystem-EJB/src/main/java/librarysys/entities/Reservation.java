package librarysys.entities;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*
 * Added a Reservation class to keep track of the reservation history for each member and copy.
 * */

@Entity
@Table(name = "RESERVATION")
public class Reservation {

	@Column(name = "status_date")
    private Date statusDate;
	@Column(name = "status")
    private String status;
//    @ManyToOne
//    @JoinColumn(name = "publication_id")
//    private PublicationModel publication;
	@ManyToOne
	@JoinColumn(name = "copy_id")
    private CopyModel copyModel;
	@ManyToOne
	@JoinColumn(name = "member_id")
    private MemberModel memberModel;
    
    //public enum Statusenum{Canceled,OnHold,Pending};
    //private Statusenum status;

    public Reservation(){}
    
    public Reservation(MemberModel m, PublicationModel pub) {
        this.memberModel = m;
      //  this.publication = pub;
        this.setStatus("Pending");
        Calendar statusdate = Calendar.getInstance();
        Date d = statusdate.getTime();
        this.statusDate = d;
        //pub.addReservation(this);
        //m.addReservation(this);
// NEWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWw
//        for (CopyModel c : publication.getCopies()) {
//            if (c.getStatus().equals("Available")) {
//                System.out.println(c.getStatus());
//               // c.hold();
//                System.out.println(c.getStatus());
//            }
//        }
// NEWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWw
    }


    public Date getStatusDate() {
		return statusDate;
	}


	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

//	public PublicationModel getPublicationModel() {
//		return publicationModel;
//	}
//
//	public void setPublicationModel(PublicationModel publicationModel) {
//		this.publicationModel = publicationModel;
//	}

	public CopyModel getCopyModel() {
		return copyModel;
	}


	public void setCopyModel(CopyModel copyModel) {
		this.copyModel = copyModel;
	}


	public MemberModel getMemberModel() {
		return memberModel;
	}


	public void setMemberModel(MemberModel memberModel) {
		this.memberModel = memberModel;
	}


	public void cancel() {
        if (!this.getStatus().equals("Fulfilled")) {
            this.setStatus("Canceled");
            Calendar statusdate = Calendar.getInstance();
            Date d = statusdate.getTime();
            this.setStatusDate(d);
            //this.publication.getAllReservations().remove(this);
            // NEWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWw
            if (this.copyModel != null) {
                this.copyModel.setStatus("Available");
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
            //this.member.loan(copy);
        }
    }

    public void hold(CopyModel c) {
        this.setStatus("Onhold");
        Calendar statusdate = Calendar.getInstance();
        Date d = statusdate.getTime();
        this.setStatusDate(d);
        this.copyModel = c;
    }
}

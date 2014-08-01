package librarysys.web.services;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;

import librarysys.entities.Member;
import librarysys.entities.Publication;
import librarysys.entities.Reservation;
import librarysys.managers.interfaces.ReservationManager;

@ManagedBean
public class ReservationService {
	@Autowired
	private ReservationManager reservationManager;
	
	private Member member;
	private Publication publication;
	private Reservation reservation;
	
	public void bookPublication(){
		reservation.setMemberModel(member);
		reservationManager.save(reservation);
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
	
}

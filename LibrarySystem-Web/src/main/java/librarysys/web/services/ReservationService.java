package librarysys.web.services;

import java.util.LinkedList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;

import librarysys.entities.Book;
import librarysys.entities.Copy;
import librarysys.entities.Member;
import librarysys.entities.Publication;
import librarysys.entities.Reservation;
import librarysys.managers.interfaces.PublicationManager;
import librarysys.managers.interfaces.ReservationManager;

@ManagedBean
public class ReservationService {
	@Autowired
	private ReservationManager reservationManager;
	@Autowired
	private PublicationManager publicationManager;
	
	private Member member;
	private Copy publicationCopy;
	private Reservation reservation;
	
	public void bookPublication(){
		reservation.setMemberModel(member);
		reservation.setCopyModel(publicationCopy);;
		reservationManager.save(reservation);
	}
	
	// Two Approaches, either to Display Available Books or Magazines.
	// or Display all of them, and do an Ajax request to check if publication is available.
	public List<Publication> getBooks(){
		List<Publication> books = new LinkedList<Publication>();
		for(Publication publication : publicationManager.getAll()){
			if(publication instanceof Book){
				books.add(publication);
			}
		}
		return books;
	}
	
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}

	public Copy getPublicationCopy() {
		return publicationCopy;
	}

	public void setPublicationCopy(Copy publicationCopy) {
		this.publicationCopy = publicationCopy;
	}

	
}

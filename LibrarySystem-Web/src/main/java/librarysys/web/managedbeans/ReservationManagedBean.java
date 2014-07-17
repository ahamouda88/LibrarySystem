package librarysys.web.managedbeans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import librarysys.entities.Reservation;
import librarysys.managers.interfaces.ReservationManager;

import org.springframework.beans.factory.annotation.Autowired;

@ManagedBean(name="reservationMB")
@RequestScoped
public class ReservationManagedBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ReservationManager reservationManager;
	private Reservation reservation;
	
	public ReservationManagedBean() {
		reservation = new Reservation();
	}

	public String saveReservation(){
		String page = "";
		reservationManager.save(reservation);
		return page;
	}
	
	public ReservationManager getReservationManager() {
		return reservationManager;
	}

	public void setReservationManager(ReservationManager reservationManager) {
		this.reservationManager = reservationManager;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
}

package librarysys.dao;

import org.springframework.stereotype.Repository;

import librarysys.dao.interfaces.ReservationDAO;
import librarysys.entities.Reservation;

@Repository
public class ReservationDAOImpl extends AbstractDAOImpl<Reservation, Integer> implements ReservationDAO{
	
	public ReservationDAOImpl(){
		super(Reservation.class);
	}
	
}

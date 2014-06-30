package librarysys.managers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import librarysys.dao.interfaces.ReservationDAO;
import librarysys.entities.Reservation;
import librarysys.managers.interfaces.ReservationManager;

@Service
public class ReservationManagerImpl extends AbstractManagerImpl<Reservation, Integer> implements ReservationManager{

	@Autowired
	private ReservationDAO reservationDAO;
}

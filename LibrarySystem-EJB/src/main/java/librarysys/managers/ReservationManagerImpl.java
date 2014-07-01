package librarysys.managers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import librarysys.dao.interfaces.ReservationDAO;
import librarysys.entities.Reservation;
import librarysys.managers.interfaces.ReservationManager;

@Service
@Transactional
public class ReservationManagerImpl extends AbstractManagerImpl<Reservation, Integer> implements ReservationManager{

	@Autowired
	private ReservationDAO reservationDAO;
}

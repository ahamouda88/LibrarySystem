package librarysys.managers;

import org.springframework.stereotype.Service;

import librarysys.entities.Reservation;
import librarysys.managers.interfaces.ReservationManager;

@Service
public class ReservationManagerImpl extends AbstractManagerImpl<Reservation, Integer> implements ReservationManager{

}

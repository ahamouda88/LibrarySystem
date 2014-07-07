package librarysys.managers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import librarysys.dao.interfaces.ReservationDAO;
import librarysys.entities.Reservation;
import librarysys.managers.interfaces.ReservationManager;

@Service
@Transactional
public class ReservationManagerImpl implements ReservationManager{

	@Autowired
	private ReservationDAO reservationDAO;

	public Reservation getByPrimaryKey(Integer key) {
		return reservationDAO.getByPrimaryKey(key);
	}

	public List<Reservation> getAll() {
		return reservationDAO.getAll();
	}

	public void save(Reservation entity) {
		reservationDAO.save(entity);
		
	}

	public void remove(Reservation entity) {
		reservationDAO.remove(entity);
		
	}

	public void update(Reservation entity) {
		reservationDAO.update(entity);
	}
}

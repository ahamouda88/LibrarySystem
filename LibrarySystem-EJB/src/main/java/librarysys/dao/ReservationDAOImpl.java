package librarysys.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import librarysys.dao.interfaces.ReservationDAO;
import librarysys.entities.Reservation;

@Repository
public class ReservationDAOImpl extends AbstractDAOImpl<Reservation, Integer> implements ReservationDAO{

	public Reservation getByPrimaryKey(Integer key) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Reservation> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

package librarysys.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import librarysys.dao.interfaces.ReservationDAO;
import librarysys.entities.Reservation;

@Repository
public class ReservationDAOImpl extends AbstractDAOImpl<Reservation, Integer> implements ReservationDAO{

	public Reservation getByPrimaryKey(Integer key) {
		return (Reservation) getCurrentSession().load(Reservation.class, key);
	}

	@SuppressWarnings("unchecked")
	public List<Reservation> getAll() {
		return (List<Reservation>) getCurrentSession().createCriteria(Reservation.class).list();
	}

}

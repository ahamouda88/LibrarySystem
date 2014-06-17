package librarysys.dao.interfaces;

import java.util.List;

import librarysys.entities.Reservation;

public interface ReservationDAO {
	public List<Reservation> getReservation();

	public Reservation getReservation(int id);

	public boolean saveReservation(Reservation reservation);

	public boolean updateReservation(Reservation reservation);

	public boolean deleteReservation(Reservation reservation);
}

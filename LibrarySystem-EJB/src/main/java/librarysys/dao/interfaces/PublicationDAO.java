package librarysys.dao.interfaces;

import java.util.List;

import librarysys.entities.Publication;

public interface PublicationDAO {
	public List<Publication> getPublication();

	public Publication getPublication(int id);

	public boolean savePublication(Publication publication);

	public boolean updatePublication(Publication publication);

	public boolean deletePublication(Publication publication);
}

package librarysys.dao.interfaces;

import java.util.List;

import librarysys.entities.Copy;

public interface CopyDAO {
	public List<Copy> getCopy();

	public Copy getCopy(int id);

	public boolean saveCopy(Copy copy);

	public boolean updateCopy(Copy copy);

	public boolean deleteCopy(Copy copy);
}

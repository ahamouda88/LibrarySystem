package librarysys.dao;

import librarysys.dao.interfaces.AddressDAO;
import librarysys.entities.Address;

public class AddressDAOImpl extends AbstractDAOImpl<Address, Integer> implements AddressDAO{

	public Address getByPrimaryKey(Integer key) {
		return (Address) getCurrentSession().load(Address.class, key);
	}
}

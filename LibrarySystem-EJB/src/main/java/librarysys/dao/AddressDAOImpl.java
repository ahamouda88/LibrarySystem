package librarysys.dao;

import org.springframework.stereotype.Repository;

import librarysys.dao.interfaces.AddressDAO;
import librarysys.entities.Address;

@Repository
public class AddressDAOImpl extends AbstractDAOImpl<Address, Integer> implements AddressDAO{

	public AddressDAOImpl(){
		super(Address.class);
	}

}

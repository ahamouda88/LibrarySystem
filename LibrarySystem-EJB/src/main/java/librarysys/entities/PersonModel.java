package librarysys.entities;


public abstract class PersonModel {
	private String firstname;
	private String lastname;
	private int telephone;
	private AddressModel address;
	
	public PersonModel(){}

	public PersonModel(String firstname, String lastname, int telephone, AddressModel address) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.telephone = telephone;
		this.address = address;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String s) {
		this.firstname = s;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String s) {
		this.lastname = s;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int tel) {
		this.telephone = tel;
	}

	public AddressModel getAddress() {
		return address;
	}

	public void setAddress(AddressModel address) {
		this.address = address;
	}

}

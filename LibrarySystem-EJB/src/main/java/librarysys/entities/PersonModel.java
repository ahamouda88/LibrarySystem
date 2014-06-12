package librarysys.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class PersonModel {
	
	@Column(name = "id")
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "first_name")
	private String firstname;
	@Column(name = "last_name")
	private String lastname;
	@Column(name = "phone")
	private int telephone;
	//Association
	private AddressModel address;
	
	public PersonModel(){}

	public PersonModel(String firstname, String lastname, int telephone, AddressModel address) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.telephone = telephone;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

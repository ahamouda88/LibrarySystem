package librarysys.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS")
public class Address {

	@Column(name = "id")
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "street")
	private String street;
	@Column(name = "state")
    private String state;
	@Column(name = "city")
    private String city;
	@Column(name = "zip_code")
    private int zipcode;
    
    public Address(){}

    public Address(String street, String state, String city, int zipcode) {
        this.street = street;
        this.state = state;
        this.city = city;
        this.zipcode = zipcode;
    }

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
    
    public String getStreet() {
        return street;
    }

    public void setStreet(String s) {
        this.street = s;
    }

    public String getState() {
        return state;
    }

    public void setState(String s) {
        this.state = s;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String s) {
        this.city = s;
    }
    
}

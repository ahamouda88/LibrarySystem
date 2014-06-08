package librarysys.entities;

public class AddressModel {

    private String street;
    private String state;
    private String city;
    private int zipcode;

    public AddressModel(String street, String state, String city, int zipcode) {
        this.street = street;
        this.state = state;
        this.city = city;
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

    public int getzipcode() {
        return zipcode;
    }

    public void setzipcode(int zipcode) {
        this.zipcode = zipcode;
    }
}

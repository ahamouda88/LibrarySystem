package librarysys.entities;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Author")
public class AuthorModel extends PersonModel {

    private String credentials;
    private String short_bio;
    private List<BookModel> books = new ArrayList<BookModel>();
    
    public AuthorModel(){}

    public AuthorModel(String firstname, String lastname, int telephone, AddressModel address, String credentials, String shortbio) {
        super(firstname, lastname, telephone, address);
        this.credentials = credentials;
        this.short_bio = shortbio;
    }

    public String getCredentials() {
        return this.credentials;
    }

    public void setCredentials(String s) {
        this.credentials = s;
    }

	public String getShort_bio() {
		return short_bio;
	}

	public void setShort_bio(String short_bio) {
		this.short_bio = short_bio;
	}

	public List<BookModel> getBooks() {
		return books;
	}

	public void setBooks(List<BookModel> books) {
		this.books = books;
	}


}

package librarysys.entities;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "AUTHOR")
@PrimaryKeyJoinColumn(name = "id")
public class AuthorModel extends PersonModel {

	@Column(name = "cerdentials")
    private String credentials;
	@Column(name = "short_bio")
    private String short_bio;
	@ManyToMany
	@JoinTable(name = "Author_Book", 
				joinColumns = {@JoinColumn(name = "author_id", unique = true)},
				inverseJoinColumns = {@JoinColumn(name = "book_id")})
    private List<BookModel> books;
    
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

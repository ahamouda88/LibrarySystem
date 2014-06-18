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
@PrimaryKeyJoinColumn(name = "author_id", referencedColumnName = "id")
public class Author extends Person {

	@Column(name = "cerdentials")
    private String credentials;
	@Column(name = "short_bio")
    private String short_bio;
	@ManyToMany
	@JoinTable(name = "Author_Book", 
				joinColumns = {@JoinColumn(name = "author_id", unique = true)},
				inverseJoinColumns = {@JoinColumn(name = "book_id")})
    private List<Book> books;
    
    public Author(){}

    public Author(String firstname, String lastname, int telephone, Address address, String credentials, String shortbio) {
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

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}


}

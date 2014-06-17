package librarysys.entities;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK")
@PrimaryKeyJoinColumn(name = "book_id", referencedColumnName = "id")
public class Book extends Publication {

	@Column(name = "ISBN")
    private int ISBN;
	@ManyToMany(mappedBy = "books")
    private List<Author> authors;

    public Book(){}
    
    public Book(String title, int max, int ISBN) {
        super(title, max);
        this.ISBN = ISBN;                
    }

	public int getISBN() {
        return this.ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
   
}

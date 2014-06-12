package librarysys.entities;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK")
@PrimaryKeyJoinColumn(name = "id")
public class BookModel extends PublicationModel {

	@Column(name = "ISBN")
    private int ISBN;
	// Association
    private List<AuthorModel> authors = new ArrayList<AuthorModel>();

    public BookModel(){}
    
    public BookModel(String title, int max, int ISBN) {
        super(title, max);
        this.ISBN = ISBN;                
    }

	public int getISBN() {
        return this.ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

	public List<AuthorModel> getAuthors() {
		return authors;
	}

	public void setAuthors(List<AuthorModel> authors) {
		this.authors = authors;
	}
   
}

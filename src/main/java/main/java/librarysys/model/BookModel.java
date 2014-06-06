package main.java.librarysys.model;

import java.util.*;

public class BookModel extends PublicationModel {

    private int ISBN;
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

package main.java.model;

import java.util.*;

import main.java.library.Book;

public class AuthorModel extends PersonModel {

    private String credentials;
    private String short_bio;
    private List<Book> books = new ArrayList<Book>();
    
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

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}


}

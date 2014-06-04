package main.java.library;

import java.util.*;

public class Author extends Person {

    private String credentials;
    private String short_bio;
    private List<Book> books;

    public Author(String firstname, String lastname, int telephone, Address address, String credentials, String shortbio, Book b) {
        super(firstname, lastname, telephone, address);
        books = new ArrayList<Book>();
        this.credentials = credentials;
        this.short_bio = shortbio;
        this.addBook(b);
        b.addAuthor(this);

    }

    public String getCredentials() {
        return this.credentials;
    }

    public void setCredentials(String s) {
        this.credentials = s;
    }

    public String getShortbio() {
        return this.short_bio;
    }

    public void setShortbio(String s) {
        this.short_bio = s;
    }

    public void addBook(Book b) {
        books.add(b);
    }
}

package main.java.library;

import java.util.*;

import main.java.model.AuthorModel;

public class Book extends Publication {

    private int ISBN;
    private List<AuthorModel> authors;

    public Book(String title, int max, int ISBN) {
        super(title, max);
        authors = new ArrayList<AuthorModel>();
        this.ISBN = ISBN;                
    }

    public int getISBN() {
        return this.ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    
    public void addAuthor(AuthorModel a)
    {
        authors.add(a);
    }
}

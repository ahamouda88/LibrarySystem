package main.java.library;

import java.util.*;

public class Book extends Publication {

    private int ISBN;
    private List<Author> authors;

    public Book(String title, int max, int ISBN) {
        super(title, max);
        authors = new ArrayList<Author>();
        this.ISBN = ISBN;                
    }

    public int getISBN() {
        return this.ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    
    public void addAuthor(Author a)
    {
        authors.add(a);
    }
}

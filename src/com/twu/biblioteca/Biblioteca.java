package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Book> books;

    public Biblioteca() {

        books = new ArrayList() {
            {
                add(new Book(1, "Artificial Intelligence: A Modern Approach", "Peter Norvig and Stuart J. Russell", "1994", true));
                add(new Book(2, "Clean Code", "Robert Cecil Martin","2008", true));
                add(new Book(3,"Dreamcatcher","Stephen King","2001", true));
                add(new Book(4,"It","Stephen King", "1986", true));
                add(new Book(5,"Paper towns", "John Green", "2008", true));
                add(new Book(6,"Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "2011", true));
                add(new Book(7,"Test Driven Development: By Example", "Kent Beck", "2002", true));
                add(new Book(8,"The fault in our stars", "John Green", "2012", true));
                add(new Book(9,"The shinning", "Stephen King", "1977", true));
            }
        };
    }

    public List getBooks() {
        return books;
    }

    public boolean checkoutBook(int reference){

        Book bookToCheckout = books.stream().
                filter(book -> book.getReference() == reference).
                findFirst().orElse(null);

        if(bookToCheckout == null || !bookToCheckout.isAvailable())
            return false;

        bookToCheckout.setAvailable(false);
        return true;
    }

    public void returnBook(int reference){

        Book bookToReturn = books.stream().
                filter(book -> book.getReference() == reference).
                findFirst().orElse(null);

        bookToReturn.setAvailable(true);
    }
}

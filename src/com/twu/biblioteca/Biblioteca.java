package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Book> books;

    public Biblioteca() {

        books = new ArrayList() {
            {
                add(new Book("Artificial Intelligence: A Modern Approach", "Peter Norvig and Stuart J. Russell", "1994"));
                add(new Book("Clean Code", "Robert Cecil Martin","2008"));
                add(new Book("Dreamcatcher","Stephen King","2001"));
                add(new Book("It","Stephen King", "1986"));
                add(new Book("Paper towns", "John Green", "2008"));
                add(new Book("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "2011"));
                add(new Book("Test Driven Development: By Example", "Kent Beck", "2002"));
                add(new Book("The fault in our stars", "John Green", "2012"));
                add(new Book("The shinning", "Stephen King", "1977"));
            }
        };
    }

    public List getBooks() {
        return books;
    }
}

package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Book> books;
    private List<Movie> movies;

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

        movies = new ArrayList() {
            {
                add(new Movie("Breakfast at Tiffany's", "1961", "Blake Edwards", 7.7, true));
                add(new Movie("Pulp Fiction", "1994", "Quentin Tarantino", 8.9, true));
                add(new Movie("Fight Club", "1999", "David Fincher", 8.8, true));
                add(new Movie("Forrest Gump", "1994", "Robert Zemeckis", 8.8, true));
                add(new Movie("Matrix", "1999", "Lana Wachowski e Lilly Wachowski (as The Wachowski Brothers)", 8.7, false));
                add(new Movie("Inception", "2010", "Christopher Nolan", 0, true));
            }
        };
    }

    public List getBooks() {
        return books;
    }

    public Book getBookByReference(int reference){

        return books.stream().
                filter(book -> book.getReference() == reference).
                findFirst().orElse(null);
    }

    public boolean checkoutBook(int reference){

        Book bookToCheckout = getBookByReference(reference);

        if(bookToCheckout == null || !bookToCheckout.isAvailable())
            return false;

        bookToCheckout.setAvailable(false);
        return true;
    }

    public boolean returnBook(int reference){

        Book bookToReturn = getBookByReference(reference);

        if(bookToReturn == null || bookToReturn.isAvailable())
            return false;

        bookToReturn.setAvailable(true);
        return true;
    }

    public List getMovies() {
        return movies;
    }

    public void checkoutMovie(String name){

        Movie movieToCheckout = movies.stream().
                filter(movie -> movie.getName().toLowerCase().equals(name.toLowerCase())).
                findFirst().orElse(null);

        movieToCheckout.setAvailable(false);
    }
}

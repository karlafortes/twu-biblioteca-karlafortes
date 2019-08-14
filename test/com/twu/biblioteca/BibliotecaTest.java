package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BibliotecaTest {

    private Biblioteca biblioteca;

    @Before
    public void setUp() {
        biblioteca = new Biblioteca();
    }

    @Test
    public void getBooks() {

       // assertThat(biblioteca.getBooks(), assertNotNull(biblioteca.getBooks()));
    }

    @Test
    public void checkoutBook() {

        biblioteca.checkoutBook(3);
        Book checkedoutBook = biblioteca.getBookByReference(3);

        //assertThat(checkedoutBook, not(checkedoutBook.isAvailable()));
        assertFalse(checkedoutBook.isAvailable());
    }

    @Test
    public void shouldMakeAnUnavailableBookAvailable(){

        biblioteca.returnBook(3);
        Book bookReturned = biblioteca.getBookByReference(3);

        assertTrue(bookReturned.isAvailable());
    }

    @Test
    public void  shouldReturnFalseIfBookIsAlreadyCheckout(){

        biblioteca.checkoutBook(3);
        boolean couldChekoutBook = biblioteca.checkoutBook(3);

        assertFalse(couldChekoutBook);
    }

    @Test
    public void  shouldReturnTrueIfBookIsSuccessfulReturn(){

        biblioteca.returnBook(3);
        boolean couldReturnBook = biblioteca.returnBook(3);

        assertFalse(couldReturnBook);
    }

    @Test
    public void getMovies() {

        assertNotNull(biblioteca.getMovies());
    }

    @Test
    public void checkoutMovie() {

        List<Movie> movies = biblioteca.getMovies();

        biblioteca.checkoutMovie("matrix");

        Movie checkedoutMovie =  movies.stream().
                filter(movie -> movie.getName().toLowerCase().equals("matrix")).
                findFirst().orElse(null);

        assertFalse(checkedoutMovie.isAvailable());
    }

    @Test
    public void shouldReturnTrueIfLoginAndPasswordMatchesInput(){

        assertTrue(biblioteca.isValidLogin("135791", "password"));
    }

    @Test
    public void shouldReturnFalseIfLoginAndPasswordMatchesInput(){

        assertFalse(biblioteca.isValidLogin("135791", "popcorn"));
    }
}

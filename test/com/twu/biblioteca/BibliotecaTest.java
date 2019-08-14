package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class BibliotecaTest {

    private Biblioteca biblioteca;
    private List<Book> books;

    @Before
    public void setUp() {
        biblioteca = new Biblioteca();
        books = biblioteca.getBooks();
    }


    @Test
    public void getBook() {

        Biblioteca biblioteca = new Biblioteca();

       // assertThat(biblioteca.getBooks(), assertNotNull(biblioteca.getBooks()));
    }

    @Test
    public void checkoutBook() {

        biblioteca.checkoutBook(3);
        Book checkedoutBook = getBookByReference(3);

        //assertThat(checkedoutBook, not(checkedoutBook.isAvailable()));
        assertFalse(checkedoutBook.isAvailable());
    }

    @Test
    public void shouldMakeAnUnavailableBookAvailable(){

        biblioteca.returnBook(3);
        Book bookReturned = getBookByReference(3);

        assertTrue(bookReturned.isAvailable());
    }

    @Test
    public void  shouldReturnFalseIfBookIsAlreadyCheckout(){

        biblioteca.checkoutBook(3);
        boolean couldChekoutBook = biblioteca.checkoutBook(3);

        assertFalse(couldChekoutBook);
    }

    private Book getBookByReference(int reference){

        return books.stream().
                filter(book -> book.getReference() == reference).
                findFirst().get();
    }
}

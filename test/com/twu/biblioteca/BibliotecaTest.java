package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BibliotecaTest {

    private Biblioteca biblioteca;

    @Before
    public void setUp() {
        biblioteca = new Biblioteca();
    }

    @Test
    public void getBook() {

        Biblioteca biblioteca = new Biblioteca();

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
}

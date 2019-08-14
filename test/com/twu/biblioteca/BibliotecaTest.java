package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import java.util.List;

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

        biblioteca.CheckoutBook(3);
        List<Book> books = biblioteca.getBooks();

        Book checkedoutBook = books.stream().
                filter(book -> book.getReference() == 3).
                findFirst().get();

        //assertThat(checkedoutBook, not(checkedoutBook.isAvailable()));
        assertFalse(checkedoutBook.isAvailable());
    }

    public void  shouldReturnFalseIfBookIsAlreadyCheckout(){

        biblioteca.CheckoutBook(3);
        boolean couldChekoutBook = biblioteca.CheckoutBook(3);

        assertFalse(couldChekoutBook);
    }
}

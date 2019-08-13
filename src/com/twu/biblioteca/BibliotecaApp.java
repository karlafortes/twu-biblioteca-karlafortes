package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        List<Book> books = biblioteca.getBooks();

        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
        System.out.println();
        System.out.println("This list contains all of our awesome books. Check it out:");
        System.out.println();

        for (Book book:books) {
            System.out.printf("| %s | %s | %s |%n", book.getTitle(), book.getAuthor(), book.getYear());
        }
    }
}

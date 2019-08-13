package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    static List<Book> Books = new ArrayList<Book>() {
        {
            add(new Book("Artificial Intelligence: A Modern Approach", "Peter Norvig and Stuart J. Russell", "1994"));
            add(new Book("Clean Code", "",""));
            add(new Book("Dreamcatcher","",""));
            add(new Book("It","", ""));
            add(new Book("Paper towns", "", ""));
            add(new Book("Sapiens: A Brief History of Humankind", "", ""));
            add(new Book("Test Driven Development: By Example", "", ""));
            add(new Book("The fault in our stars", "", ""));
            add(new Book("The shinning", "", ""));
        }
    };

    public static void main(String[] args) {

        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
        System.out.println();
        System.out.println("This list contains all of our awesome books. Check it out:");
        System.out.println();

        for (Book book:Books) {
            System.out.println("- " + book.getTitle());
        }
    }
}

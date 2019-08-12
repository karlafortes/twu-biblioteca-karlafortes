package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    static List<String> Books = new ArrayList<String>()
    {
        {
            add("Artificial Intelligence: A Modern Approach");
            add("Clean Code");
            add("Dreamcatcher");
            add("It");
            add("Paper towns");
            add("Sapiens: A Brief History of Humankind");
            add("Test Driven Development: By Example");
            add("The fault in our stars");
            add("The shinning" );
        }
    };

    public static void main(String[] args)
    {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
        System.out.println();
        System.out.println("This list contains all of our awesome books. Check it out:");
        System.out.println();

        for (String book:Books) {
            System.out.println("- " + book);
        }
    }
}

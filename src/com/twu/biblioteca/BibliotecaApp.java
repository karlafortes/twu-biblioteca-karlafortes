package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
        System.out.println();
        System.out.println("Choose the number of the option would like to do:");
        System.out.println();
        System.out.println("1. List all books");
        System.out.println();
        int option = scanner.nextInt();

        if(option == 1){

            ListBook();
        }
    }

    public static void ListBook(){

        System.out.println();
        System.out.println("This list contains all of our awesome books. Check it out:");
        System.out.println();

        for (Book book:Books) {
            System.out.println("- " + book.getTitle());
        }
    }
}

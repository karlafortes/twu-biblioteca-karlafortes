package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    private static Biblioteca biblioteca;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        biblioteca = new Biblioteca();

        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");

        int option;

        do {
            System.out.println("\nChoose the number of the option would like to do:");
            System.out.println("\n1. List all books");
            System.out.println("2. Exit\n");
            option = scanner.nextInt();

            switch(option) {
                case 1:
                    booksListMenu();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("\nPlease, select a valid option!");
            }

        } while (option != 2);
    }

    public static void booksListMenu(){

        listBook();

        System.out.println("\nWhat would you like to do?\n");
        System.out.println("\n1. Checkout a book");
        System.out.println("2. Return a book\n");

        int option = scanner.nextInt();

        switch(option) {
            case 1:
                checkoutBook();
                break;
            case 2:
                returnBook();
                break;
            default:
                break;
        }
    }

    public static void listBook(){

        List<Book> books = biblioteca.getBooks();

        System.out.println("\nThis list contains all of our awesome books. Check it out:\n");

        for (Book book:books) {
            if(book.isAvailable())
                System.out.printf("| %s | %s | %s | %s |%n", book.getReference(), book.getTitle(), book.getAuthor(), book.getYear());
        }
    }

    public static void checkoutBook(){

        System.out.println("\nPlease, inform the reference of the book you want to checkout:");
        int reference = scanner.nextInt();

        boolean checkoutSuccess = biblioteca.checkoutBook(reference);

        if(checkoutSuccess)
            System.out.println("\nThank you! Enjoy the book");
        else
            System.out.println("\nSorry, that book is not available");
    }

    public static void returnBook(){

        System.out.println("\nPlease, inform the reference of the book you want to return:");
        int reference = scanner.nextInt();
        biblioteca.returnBook(reference);
    }
}

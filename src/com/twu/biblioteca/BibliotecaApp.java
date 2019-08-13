package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    private static Biblioteca biblioteca;

    public static void main(String[] args) {

        biblioteca = new Biblioteca();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");

        int option;

        do {
            System.out.println("\nChoose the number of the option would like to do:");
            System.out.println("\n1. List all books");
            System.out.println("2. Exit\n");
            option = scanner.nextInt();

            switch(option) {
                case 1:
                    ListBook();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("\nPlease, select a valid option!");
            }

        } while (option != 2);
    }

    public static void ListBook(){

        List<Book> books = biblioteca.getBooks();

        System.out.println("\nThis list contains all of our awesome books. Check it out:\n");

        for (Book book:books) {
            System.out.printf("| %s | %s | %s |%n", book.getTitle(), book.getAuthor(), book.getYear());
        }
    }
}

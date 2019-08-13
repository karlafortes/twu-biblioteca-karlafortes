package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    static Biblioteca biblioteca;

    public static void main(String[] args) {

        biblioteca = new Biblioteca();
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

        List<Book> books = biblioteca.getBooks();

        System.out.println();
        System.out.println("This list contains all of our awesome books. Check it out:");
        System.out.println();

        for (Book book:books) {
            System.out.printf("| %s | %s | %s |%n", book.getTitle(), book.getAuthor(), book.getYear());
        }
    }
}

package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    private static Biblioteca biblioteca;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        biblioteca = new Biblioteca();

        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n");
        System.out.println("Please, enter your library number:\n");
        String login = new Scanner(System.in).nextLine();
        System.out.println("\nNow, enter your password:\n");
        String password = new Scanner(System.in).nextLine();

        if(biblioteca.isValidLogin(login, password)){
            loginSuccess();
        }
        else {
            System.out.println("\nLogin and/or password invalid!");
        }
    }

    public static void loginSuccess(){

        int option;

        do {

            System.out.println("\nChoose the number of the option you would like to:");
            System.out.println("\n1. List all books");
            System.out.println("2. List all movies");
            System.out.println("3. Exit\n");

            option = scanner.nextInt();

            switch(option) {
                case 1:
                    booksListMenu();
                    break;
                case 2:
                    moviesListMenu();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("\nPlease, select a valid option!");
            }

        } while (option != 3);
    }

    public static void booksListMenu(){

        listBooks();

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

    public static void listBooks(){

        List<Book> books = biblioteca.getBooks();

        System.out.println("\nThis list contains all of our awesome books. Check it out:\n");

        for (Book book:books) {
            if(book.isAvailable())
                System.out.printf("Ref: %s | Title: %s | Author: %s | Year: %s%n", book.getReference(), book.getTitle(), book.getAuthor(), book.getYear());
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

        boolean returnSuccess = biblioteca.returnBook(reference);

        if(returnSuccess)
            System.out.println("\nThank you for returning the book");
        else
            System.out.println("\nThat is not a valid book to return");
    }

    public static void listMovies(){

        List<Movie> movies = biblioteca.getMovies();

        System.out.println("\nThis list contains all of our awesome movies. Check it out:\n");

        for (Movie movie:movies) {
            if(movie.isAvailable())
                System.out.printf("Name: %s | Year: %s | Director: %s | Rating: %s%n", movie.getName(), movie.getYear(), movie.getDirector(), movie.getRating());
        }
    }

    public static void moviesListMenu(){

        listMovies();

        System.out.println("\nWhat would you like to do?\n");
        System.out.println("\n1. Checkout a movie\n");

        int option = scanner.nextInt();

        switch(option) {
            case 1:
                checkoutMovie();
                break;
            default:
                break;
        }
    }

    public static void checkoutMovie(){

        System.out.println("\nPlease, inform the name of the movie you want to checkout:");
        String name = new Scanner(System.in).nextLine();

        biblioteca.checkoutMovie(name);
    }
}

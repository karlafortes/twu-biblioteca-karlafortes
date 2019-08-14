package com.twu.biblioteca;

public class Book {

    private int reference;
    private String title;
    private String author;
    private String year;
    private boolean available;

    public Book(int reference, String title, String author, String year, boolean available) {

        this.reference = reference;
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = available;
    }

    public int getReference() {
        return reference;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getYear() {
        return year;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }
}

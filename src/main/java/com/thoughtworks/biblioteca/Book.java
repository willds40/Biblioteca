package com.thoughtworks.biblioteca;
import java.io.PrintStream;

/**
 * Created by gmartine on 1/12/17.
 */
public class Book {
    private int yearPublished;
    private String author;
    private String title;
    private PrintStream printStream;

    public Book(PrintStream printStream, String title, String author, int yearPublished) {
        this.printStream = printStream;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;

    }

    public void printTitle() {
        printStream.println(this.title);
    }

    public void printAuthor() {
        printStream.println(this.author);
    }

    public void printYearPublished() {
        printStream.println(this.yearPublished);
    }

    public void printBookRecord(){
        String bookRecord = String.format("%-50s", title);
        bookRecord += String.format("%-25s", author);
        bookRecord += yearPublished;
        bookRecord += "\n";
        printStream.println(bookRecord);

    }
}

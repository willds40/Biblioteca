package com.thoughtworks.biblioteca;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gmartine on 1/11/17.
 */
public class Library {

    private final List<Book> books;
    private final PrintStream printStream;
    private final BufferedReader bufferdReader;

    public Library(List<Book> books, PrintStream printStream, BufferedReader bufferedReader) {
        this.books = books;
        this.printStream = printStream;
        this.bufferdReader = bufferedReader;
    }

    public void start() {
        printStream.println("Welcome");
    }


    public void printListOfBooks() {
        printStream.println(printColumnHeaders());
        books.get(0).printBookRecord();
    }

    private static String printColumnHeaders() {
        String columnHeaders = String.format("%-50s", "Title");
        columnHeaders += String.format("%-25s", "Author");
        columnHeaders += "Year Published\n";
        return columnHeaders;
    }
}

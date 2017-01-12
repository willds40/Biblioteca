package com.thoughtworks.biblioteca;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gmartine on 1/11/17.
 */
public class Library {

    private final List<String> books;
    private final PrintStream printStream;
    private final BufferedReader bufferdReader;

    public Library(List<String> books, PrintStream printStream, BufferedReader bufferedReader) {
        this.books = books;
        this.printStream = printStream;
        this.bufferdReader = bufferedReader;
    }

    public void start() {
        printStream.println("Welcome");
    }


    public void printListOfBooks() {
        printStream.println(books);
    }
}

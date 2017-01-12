package com.thoughtworks.biblioteca;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gmartine on 1/11/17.
 */
public class main {
    public static void main(String[] args) {
        List<String> books = new ArrayList<String>();
        PrintStream printStream;
        BufferedReader bufferedReader;
        Library library = new Library(books, printStream, bufferedReader);
        library.start();
        library.printListOfBooks();

    }

}

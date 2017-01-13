package com.thoughtworks.biblioteca;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gmartine on 1/11/17.
 */
public class LibraryTest {
    private List<Book> books;
    private PrintStream printStream;
    private Library library;
    private BufferedReader bufferedReader;
    private Book bookToAdd;

    @Before
    public void setUp() throws Exception {
        books = new ArrayList();
        bookToAdd = mock(Book.class);
        books.add(bookToAdd);
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        library = new Library(books, printStream, bufferedReader);
    }

    @Test
    public void shouldPrintAllBooksOneBook(){
        library.printListOfBooks();
        verify(bookToAdd).printBookRecord();

    }

}
package com.thoughtworks.biblioteca;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gmartine on 1/11/17.
 */
public class LibraryTest {
    private List<String> books;
    private PrintStream printStream;
    private Library library;
    private BufferedReader bufferedReader;

    @Before
    public void setUp() throws Exception {
        books = new ArrayList();
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        library = new Library(books, printStream, bufferedReader);
    }

    @Test
    public void shouldPrintWelcome(){
       library.start();
       verify(printStream).println("Welcome");
    }

    @Test
    public void shouldReturnList(){
        ArrayList<String> listOfBooks = new ArrayList();
        assertThat(library.printListOfBooks(), is(listOfBooks));

    }

    @Test
    @Ignore
    public void shouldReturnBookName(){
        ArrayList<String> listOfBooks = new ArrayList();

        //assertThat(library.printBookName(), is(listOfBooks[1].name()));
    }

}
package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by gmartine on 1/12/17.
 */
public class BookTest {
    private PrintStream printStream;
    private Book book;
    private String title;
    private String author;
    private int yearPublished;


    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        title = "Romeo and Juliet";
        author = "Shakespeare";
        yearPublished = 1600;
        book = new Book(printStream, title, author ,yearPublished);

    }

    @Test
    public void shouldPrintBookRecord(){
        String record = String.format("%-50s", "Romeo and Juliet");
        record += String.format("%-25s", "Shakespeare");
        record += 1600;
        record += "\n";
        book.printBookRecord();
        verify(printStream).println(record);
    }

}

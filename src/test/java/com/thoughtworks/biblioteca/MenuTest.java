package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by wdsand on 1/15/17.
 */
public class MenuTest {


    private PrintStream printStream;
    private Menu menu;
    private BufferedReader bufferedReader;
    private Library library;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        library = mock(Library.class);
        menu = new Menu(printStream, bufferedReader, library);

    }

    @Test
    public void shouldDisplayOptions() throws IOException {
        when(bufferedReader.readLine()).thenReturn("");

        menu.displayOptions();

        verify(printStream).println(
                "1. List Books\n" +
                "2. Quit");
    }

    @Test
    public void shouldDisplayListOfBooksWhenOption1Selected() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1");

        menu.displayOptions();
        verify(library).printListOfBooks();

    }

    @Test
    public void shouldPrintInvalidOptionWhenUserSelectsOptionNotOnList() throws IOException {
        when(bufferedReader.readLine()).thenReturn("2").thenReturn("1");
        menu.displayOptions();
        verify(library).printListOfBooks();

    }

    @Test
    public void shouldLoopUntilQuitIsSelected() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1").thenReturn("1").thenReturn("2");

        menu.displayOptions();

        verify(printStream).println("Goodbye!");
    }
}
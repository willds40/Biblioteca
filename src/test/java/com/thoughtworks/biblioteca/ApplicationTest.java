package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockingDetails;
import static org.mockito.Mockito.verify;

/**
 * Created by wdsand on 1/13/17.
 */
public class ApplicationTest {

    private PrintStream printStream;
    private Application application;
    private Library library;
    private Book book;
    private Menu menu;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        menu = mock(Menu.class);
        library = mock(Library.class);
        book = mock(Book.class);
        application = new Application(printStream, library, printStream,menu);

    }

    @Test
    public void shouldWelcomeMessge() throws IOException {
        application.startApplication();
        verify(printStream).println("Welcome");

    }

    @Test
    public void  shouldPrintMenu() throws IOException {
        application.startApplication();
        verify(menu).displayOptions();
    }
}
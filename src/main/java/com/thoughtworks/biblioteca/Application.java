package com.thoughtworks.biblioteca;

import java.awt.*;
import java.io.IOException;
import java.io.PrintStream;

public class Application {
    private  PrintStream printStream;
    private final Library library;
    private final PrintStream stream;
    private Menu menu;


    public Application(PrintStream printStream, Library library, PrintStream stream, Menu menu) {
        this.printStream = printStream;
        this.library = library;
        this.stream = stream;
        this.menu = menu;
    }

    public void startApplication() throws IOException {
        printStream.println("Welcome");
        menu.displayOptions();

    }
}

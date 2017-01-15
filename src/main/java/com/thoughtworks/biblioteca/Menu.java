package com.thoughtworks.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by wdsand on 1/15/17.
 */
public class Menu {

    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private Library library;
    private String userInput;

    public Menu(PrintStream printStream, BufferedReader bufferedReader, Library library) {

        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        this.library = library;
    }

    public void displayOptions() throws IOException {
        printStream.println(
                "1. List Books\n" +
                "2. Quit");

        receiveUserInput();

    }

    private void receiveUserInput() throws IOException {
        userInput = bufferedReader.readLine();
        do {
            if (userInput.equals("1")) {
                library.printListOfBooks();
                displayOptions();
            } else if (userInput.equals("2")) {
                printStream.println("Goodbye!");
            } else {
                printStream.println("Invalid Option. Please Select Again.");
                displayOptions();
            }
        }while(!userInput.equals("2"));

    }
}

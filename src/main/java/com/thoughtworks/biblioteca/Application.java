package com.thoughtworks.biblioteca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Application {
    private  PrintStream printStream;

    public Application(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void welcomeToTheLibrary() {
            printStream.println("Welcome");
    }

}

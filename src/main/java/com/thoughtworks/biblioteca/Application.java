package com.thoughtworks.biblioteca;

import java.io.PrintStream;

public class Application {


    private Library library;
    private PrintStream printStream;

    public Application(PrintStream printStream, Library library) {
        this.library = library;
        this.printStream = printStream;

    }

    public void start() {
        printStream.println("Welcome to Biblioteca!");
        library.printBooks();
    }
}

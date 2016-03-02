package com.thoughtworks.biblioteca;

import java.io.IOException;
import java.io.PrintStream;

public class Application {


    private Library library;
    private PrintStream printStream;
    private Menu menu;

    public Application(PrintStream printStream, Library library, Menu menu) {
        this.library = library;
        this.printStream = printStream;
        this.menu = menu;
    }

    public void start() throws IOException {
        printStream.println("Welcome to Biblioteca!\n");
        menu.showMenu();
        menu.getUserSelection();
        library.printBooks();
    }
}

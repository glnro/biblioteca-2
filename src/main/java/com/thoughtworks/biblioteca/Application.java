package com.thoughtworks.biblioteca;

import java.io.IOException;
import java.io.PrintStream;

public class Application {


    private PrintStream printStream;
    private Menu menu;
    private IsRunning isRunning;

    public Application(PrintStream printStream, Menu menu, IsRunning isRunning) {
        this.printStream = printStream;
        this.menu = menu;
        this.isRunning = isRunning;
    }

    public void start() throws IOException {
        printStream.println("Welcome to Biblioteca!\n");
        while (isRunning.isRunning()) {
            menu.startMenu();
        }
    }
}

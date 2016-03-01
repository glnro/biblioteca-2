package com.thoughtworks.biblioteca;

import java.io.PrintStream;

public class WelcomePrinter {
    PrintStream printStream;

    public WelcomePrinter(PrintStream printStream){
        this.printStream = printStream;
    }

    public void printGreeting() {
        printStream.println("Welcome to Biblioteca!");
    }
}

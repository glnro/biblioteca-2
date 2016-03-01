package com.thoughtworks.biblioteca;

import java.io.PrintStream;

public class WelcomeMessage {

    private PrintStream printStream;

    public WelcomeMessage(PrintStream printStream){
        this.printStream = printStream;
    }

    public void print() {
        printStream.println("Welcome to Biblioteca!");
    }
}

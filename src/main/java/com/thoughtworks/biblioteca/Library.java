package com.thoughtworks.biblioteca;

import java.io.PrintStream;


public class Library {

    private PrintStream printStream;

    public Library(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void printBooks() {
        String[] books = {"book 1", "book 2"};

        for(String book : books){
            printStream.println(book);
        }
    }
}

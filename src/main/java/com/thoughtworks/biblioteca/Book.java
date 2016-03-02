package com.thoughtworks.biblioteca;

import java.io.PrintStream;

public class Book {
    private PrintStream printStream;
    private String title;
    private String author;
    private String year;

    public Book(PrintStream printStream, String title, String author, String year) {
        this.printStream = printStream;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void printBookDetails(){
        printStream.println(String.format("%s  |  %s  |  %s", title, author, year));
    }
}

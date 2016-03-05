package com.thoughtworks.biblioteca;

import java.io.PrintStream;

public class Book {
    private PrintStream printStream;
    private String title;
    private String author;
    private String year;
    private boolean isAvailable;

    public Book(PrintStream printStream, String title, String author, String year) {
        this.printStream = printStream;
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }

    public void printBookDetails(){
        if(isAvailable){
            printStream.println(String.format("%s  |  %s  |  %s", title, author, year));
        }
    }

    public void checkout() {
        isAvailable = false;
    }
}

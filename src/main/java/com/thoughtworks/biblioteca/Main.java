package com.thoughtworks.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        Collection<Book> bookList = new ArrayList<>();
        PrintStream printStream = System.out;
        bookList.add(new Book(printStream, "Book one", "author", "year"));

        Library library = new Library(bookList);

        new Application(printStream, library).start();
    }

}

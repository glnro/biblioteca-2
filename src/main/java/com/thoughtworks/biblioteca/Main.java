package com.thoughtworks.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        PrintStream printStream = System.out;
        BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(System.in)));


        HashMap<String, Book> books = new HashMap<String, Book>();

        Book book = new Book(printStream, "Book one", "author", "year");
        books.put("Book one", book);

        Book book2 = new Book(printStream, "Book two", "author", "year");
        books.put("Book two", book);

        Library library =  new Library(bufferedReader, printStream, books);

        QuitCommand quitCommand = new QuitCommand(printStream);
        Command[] commands = {new PrintBooksCommand(library), new CheckoutBookCommand(library), quitCommand};

        Menu menu = new Menu(printStream, bufferedReader, commands);

        new Application(printStream, menu, quitCommand).start();
    }

}

package com.thoughtworks.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Book> bookList = new ArrayList<Book>();
        PrintStream printStream = System.out;
        BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(System.in)));
        bookList.add(new Book(printStream, "Book one", "author", "year"));

        QuitCommand quitCommand = new QuitCommand(printStream);
        Library library =  new Library(bookList, bufferedReader, printStream);
        Command[] commands = {new PrintBooksCommand(library), new CheckoutBookCommand(library), quitCommand};


        Menu menu = new Menu(printStream, bufferedReader, quitCommand, commands);

        new Application(printStream, menu).start();
    }

}

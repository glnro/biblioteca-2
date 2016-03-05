package com.thoughtworks.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        PrintStream printStream = System.out;
        BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(System.in)));

        List<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book(printStream, "Book one", "author", "year"));
        Library library =  new Library(bookList, bufferedReader, printStream);

        QuitCommand quitCommand = new QuitCommand(printStream);
        Command[] commands = {new PrintBooksCommand(library), new CheckoutBookCommand(library), quitCommand};
        Menu menu = new Menu(printStream, bufferedReader, commands);

        new Application(printStream, menu, quitCommand).start();
    }

}

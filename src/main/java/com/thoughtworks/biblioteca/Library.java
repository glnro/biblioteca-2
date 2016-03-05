package com.thoughtworks.biblioteca;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public class Library {
    private List<Book> books;
    private BufferedReader reader;
    private PrintStream printStream;

    public Library(List<Book> books, BufferedReader reader, PrintStream printStream) {

        this.books = books;
        this.reader = reader;
        this.printStream = printStream;
    }


    public void startCheckoutBookProcess() {
        printStream.println("Please enter the book number you would like to checkout");
        try {
            String bookChoice = reader.readLine();
            checkoutBook(bookChoice);
        } catch (IOException e) {
            e.printStackTrace();
        }
        printStream.println("Thank You! Enjoy the book!");
    }

    private void checkoutBook(String bookMenuNumber) {
        int bookIndex = Integer.valueOf(bookMenuNumber) - 1;
        books.get(bookIndex).checkout();
    }

    public void printBooks() {
        for(Book book : books){
            book.printBookDetails();
        }
    }
}

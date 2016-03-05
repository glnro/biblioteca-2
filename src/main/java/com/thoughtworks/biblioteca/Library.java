package com.thoughtworks.biblioteca;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Map;

public class Library {
    private BufferedReader reader;
    private PrintStream printStream;
    private Map<String, Book> books;

    public Library(BufferedReader reader, PrintStream printStream, Map<String, Book> books) {
        this.reader = reader;
        this.printStream = printStream;
        this.books = books;
    }

    public void printBooks() {
        for(Book book : books.values()){
            book.printBookDetails();
        }
    }

    public void startCheckoutBookProcess() {
        printStream.println("Please enter the book number you would like to checkout");
        printBooks();

        String bookChoice = getValidatedBookChoiceFromUser();

        checkoutBook(bookChoice);
        printStream.println("Thank You! Enjoy the book!");
    }

    private String getValidatedBookChoiceFromUser() {
        String bookChoice = "";

        try {
            bookChoice = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        while(!books.containsKey(bookChoice)){
            bookChoice = getValidatedBookChoiceFromUser();
        }

        return bookChoice;
    }

    private void checkoutBook(String bookKey) {
        books.get(bookKey).checkout();
    }
}

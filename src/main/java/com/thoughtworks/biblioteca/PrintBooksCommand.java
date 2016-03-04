package com.thoughtworks.biblioteca;

import java.util.Collection;


public class PrintBooksCommand implements Command {

    private Collection<Book> books;

    public PrintBooksCommand(Collection<Book> books) {
        this.books = books;
    }

    public void printBooks() {
        for(Book book : books){
            book.printBookDetails();
        }
    }

    @Override
    public void execute() {
        printBooks();
    }
}

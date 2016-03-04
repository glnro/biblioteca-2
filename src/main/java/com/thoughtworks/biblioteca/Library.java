package com.thoughtworks.biblioteca;

import java.util.Collection;


public class Library implements Command {

    private Collection<Book> books;

    public Library(Collection<Book> books) {
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

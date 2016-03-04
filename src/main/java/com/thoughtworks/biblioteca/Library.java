package com.thoughtworks.biblioteca;


import java.util.Collection;

public class Library {
    private Collection<Book> books;

    public Library(Collection<Book> books) {

        this.books = books;
    }

    public void checkoutBook() {

    }

    public void printBooks() {
        for(Book book : books){
            book.printBookDetails();
        }
    }
}

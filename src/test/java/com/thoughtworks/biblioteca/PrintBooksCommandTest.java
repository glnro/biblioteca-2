package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class PrintBooksCommandTest {

    private PrintBooksCommand printBooksCommand;
    private Collection<Book> books;
    private Book book;

    @Before
    public void setUp(){
        books = new ArrayList<Book>();
        printBooksCommand = new PrintBooksCommand(books);

        book = mock(Book.class);
    }

    @Test
    public void shouldPrintABook(){
        books.add(book);
        printBooksCommand.printBooks();
        verify(book).printBookDetails();
    }

    @Test
    public void ShouldPrintTwoBooksWhenGivenTwoBooks(){
        Book book2 = mock(Book.class);
        books.add(book);
        books.add(book2);

        printBooksCommand.printBooks();

        verify(book2).printBookDetails();
    }
}
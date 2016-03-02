package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BookTest {

    private PrintStream printStream;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
    }

    @Test
    public void shouldReturnAFormattedStringWithColumnsWhenToStringIsCalled(){
        Book book = new Book(printStream, "The Hitchhiker's Guide to the Galaxy", "Douglas Adams", "1970");
        book.printBookDetails();

        verify(printStream).println("The Hitchhiker's Guide to the Galaxy  |  Douglas Adams  |  1970");
    }

    @Test
    public void shouldAlwaysReturnCorrectFormattedStringCorrespondingToTheBookName(){
        Book book =  new Book(printStream, "Book 2", "Author 2", "Year 2");
        book.printBookDetails();

        verify(printStream).println("Book 2  |  Author 2  |  Year 2");
    }
}
package com.thoughtworks.biblioteca;

import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class LibraryTest {


    @Test
    public void shouldPrintListOfBooksAfterWelcomeMessage(){
        PrintStream printStream = mock(PrintStream.class);
        Library library = new Library(printStream);

        library.printBooks();

        String[] books = {"book 1", "book 2"};

        for(String book : books){
            verify(printStream).println(book);
        }
    }

}
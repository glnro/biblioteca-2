package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class PrintBooksCommandTest {

    @Test
    public void shouldRunListBooksOnExecute(){
        Library library = mock(Library.class);
        PrintBooksCommand printBooksCommand = new PrintBooksCommand(library);

        printBooksCommand.execute();

        verify(library).printBooks();
    }


}
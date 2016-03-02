package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ApplicationTest {

    private PrintStream printStream;
    private Application application;
    private Library library;

    @Before
    public void setUp() throws Exception {

        printStream = mock(PrintStream.class);

        library = mock(Library.class);
        application = new Application(printStream, library);
    }

    @Test
    public void shouldPrintWelcomeMessageOnProgramStart(){
        application.start();

        verify(printStream).println(contains("Welcome to Biblioteca!"));
    }

    @Test
    public void shouldCallPrintBooksOnProgramStart(){
        application.start();
        verify(library).printBooks();
    }
}
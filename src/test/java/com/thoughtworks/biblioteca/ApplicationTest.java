package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ApplicationTest {

    private PrintStream printStream;
    private Application application;
    private PrintBooksCommand printBooksCommand;
    private Menu menu;
    private IsRunning isRunning;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        printBooksCommand = mock(PrintBooksCommand.class);
        menu = mock(Menu.class);
        isRunning = mock(IsRunning.class);

        when(isRunning.isRunning()).thenReturn(true, false);

        application = new Application(printStream, menu, isRunning);
        application.start();
    }

    @Test
    public void shouldPrintWelcomeMessageOnProgramStart(){
        verify(printStream).println(contains("Welcome to Biblioteca!"));
    }

    @Test
    public void shouldTellMenuToDisplay() throws IOException {
        verify(menu).startMenu();
    }

}
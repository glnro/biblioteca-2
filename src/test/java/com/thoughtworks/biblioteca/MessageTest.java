package com.thoughtworks.biblioteca;


import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MessageTest {

    @Test
    public void shouldPrintWelcomeMessageOnProgramStart(){
        PrintStream printStream = mock(PrintStream.class);
        WelcomePrinter welcomePrinter = new WelcomePrinter(printStream);

        welcomePrinter.printGreeting();

        verify(printStream).println("Welcome to Biblioteca!");
    }
}

package com.thoughtworks.biblioteca;


import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class WelcomeMessageTest {

    @Test
    public void shouldPrintWelcomeMessageOnProgramStart(){
        PrintStream printStream = mock(PrintStream.class);
        WelcomeMessage welcomeMessage = new WelcomeMessage(printStream);

        welcomeMessage.print();

        verify(printStream).println(contains("Welcome to Biblioteca!"));
    }
}

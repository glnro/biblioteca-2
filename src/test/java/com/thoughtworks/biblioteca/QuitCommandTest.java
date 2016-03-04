package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class QuitCommandTest {

    private QuitCommand quitCommand;
    private PrintStream printStream;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        quitCommand = new QuitCommand(printStream);
    }

    @Test
    public void shouldStartWithValueOfFalse(){
        quitCommand.setShouldQuitToTrue();
        assertTrue(quitCommand.getShouldQuit());
    }

    @Test
    public void shouldSayThankYouOnProgramExit() {
        quitCommand.execute();
        verify(printStream).println(contains("Thank you for using our Library!"));
    }
}
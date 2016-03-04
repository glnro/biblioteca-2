package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.*;

public class MenuTest {
    private PrintStream printStream;
    private Menu menu;
    private BufferedReader bufferedReader;
    private PrintBooksCommand printBooksCommand;
    private QuitCommand quitCommand;

    @Before
    public void setUp() throws IOException {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        printBooksCommand = mock(PrintBooksCommand.class);
        quitCommand = mock(QuitCommand.class);

        menu = new Menu(printStream, bufferedReader, printBooksCommand, quitCommand);
    }

    @Test
    public void shouldShowMenuOnStart() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1");
        menu.startMenu();
        verify(printStream).println(contains("Main Menu"));
    }

    @Test
    public void shouldShowListBooksOption() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1");
        menu.startMenu();
        verify(printStream).println(contains("List Books"));
    }

    @Test
    public void shouldShowQuitOption() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1");
        menu.startMenu();
        verify(printStream).println(contains("Quit"));
    }

    @Test
    public void shouldRunListBooksWhenInputIsOne() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1");
        menu.startMenu();
        verify(printBooksCommand,atLeastOnce()).execute();
    }

    @Test
    public void shouldShowErrorMessageWhenNotGivenValidOptionSelection() throws IOException {
        when(bufferedReader.readLine()).thenReturn("asdf","1");
        menu.startMenu();
        verify(printStream).println(contains("Select a valid option!"));
    }

    @Test
    public void shouldChangeShouldQuitToTrueWhenQuitIsInputted() throws IOException {
        when(bufferedReader.readLine()).thenReturn("2");
        menu.startMenu();
        verify(quitCommand,atLeastOnce()).execute();
    }

}
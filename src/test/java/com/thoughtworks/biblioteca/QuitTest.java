package com.thoughtworks.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuitTest {
    @Test
    public void shouldStartWithValueOfFalse(){
        QuitCommand quitCommand = new QuitCommand();

        quitCommand.setShouldQuitToTrue();

        assertTrue(quitCommand.getShouldQuit());
    }
}
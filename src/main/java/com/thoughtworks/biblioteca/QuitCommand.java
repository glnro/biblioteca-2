package com.thoughtworks.biblioteca;

import java.io.PrintStream;

public class QuitCommand implements Command{

    private boolean shouldQuit = false;
    private PrintStream printStream;

    public QuitCommand(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void execute() {
        setShouldQuitToTrue();
        printStream.println("Thank you for using our Library!");
    }

    private void setShouldQuitToTrue() {
        shouldQuit = true;
    }

    public boolean getShouldQuit() {
        return shouldQuit;
    }
}

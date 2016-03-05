package com.thoughtworks.biblioteca;

import java.io.PrintStream;

public class QuitCommand implements Command, IsRunning {

    private boolean isRunning;
    private PrintStream printStream;

    public QuitCommand(PrintStream printStream) {
        this.isRunning = true;
        this.printStream = printStream;
    }

    @Override
    public void execute() {
        isRunning = false;
        printStream.println("Thank you for using our Library!");
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }
}

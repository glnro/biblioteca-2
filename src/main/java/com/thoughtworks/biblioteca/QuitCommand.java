package com.thoughtworks.biblioteca;

public class QuitCommand implements Command{

    private boolean shouldQuit = false;

    @Override
    public void execute() {

    }

    public void setShouldQuitToTrue() {
        shouldQuit = true;
    }

    public boolean getShouldQuit() {
        return shouldQuit;
    }
}

package com.thoughtworks.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Menu {

    private boolean shouldQuit;
    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private Library library;
    private QuitCommand quitCommand;

    public Menu(PrintStream printStream, BufferedReader bufferedReader, Library library, QuitCommand quitCommand) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        this.library = library;
        this.quitCommand = quitCommand;
        this.shouldQuit = false;
    }

    public boolean shouldQuitGetter() {
        return this.shouldQuit;
    }

    public void startMenu() throws IOException {
        this.showMenu();
        this.chooseOption();
    }

    private void showMenu() {
        printStream.println("Main Menu");
        printStream.println("Options (choose one):");
        printStream.println("1. List Books");
        printStream.println("2. Quit");
    }

    private void chooseOption() throws IOException {
        String input = bufferedReader.readLine();
        if (input.equals("1")) {
            library.execute();
        } else if (input.equals("2")) {
            quitCommand.execute();
            this.shouldQuit = true;
            printStream.println("Thank you for using our Library!");
        }
        else {
            printStream.println("Select a valid option!");
        }
    }
}

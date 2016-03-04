package com.thoughtworks.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Menu {

    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private PrintBooksCommand printBooksCommand;
    private QuitCommand quitCommand;

    public Menu(PrintStream printStream, BufferedReader bufferedReader, PrintBooksCommand printBooksCommand, QuitCommand quitCommand) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        this.printBooksCommand = printBooksCommand;
        this.quitCommand = quitCommand;
    }

    public boolean hasBeenToldToQuit() {
        return quitCommand.getShouldQuit();
    }

    public void startMenu() throws IOException {
        this.showMenu();
        this.chooseOption();
    }

    private void showMenu() {
        printStream.println(
                "Main Menu\n" +
                "Options (choose one):");

        printStream.println("1. List Books");
        printStream.println("2. Quit");
    }

    private void chooseOption() throws IOException {
        String input = bufferedReader.readLine();
        if (input.equals("1")) {
            printBooksCommand.execute();
        } else if (input.equals("2")) {
            quitCommand.execute();
            printStream.println("Thank you for using our Library!");
        }
        else {
            printStream.println("Select a valid option!");
        }
    }
}

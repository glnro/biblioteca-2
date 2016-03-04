package com.thoughtworks.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class Menu {

    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private PrintBooksCommand printBooksCommand;
    private QuitCommand quitCommand;
    private Map<String, Command> menuOptionDispatch;

    public Menu(PrintStream printStream, BufferedReader bufferedReader, PrintBooksCommand printBooksCommand, QuitCommand quitCommand) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        this.printBooksCommand = printBooksCommand;
        this.quitCommand = quitCommand;
        menuOptionDispatch = new HashMap<String, Command>();
        menuOptionDispatch.put("1", printBooksCommand);
        menuOptionDispatch.put("2", quitCommand);

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

        String input = getValidInput();
        menuOptionDispatch.get(input).execute();
    }

    private String getValidInput() throws IOException {
        String input = bufferedReader.readLine();

        while (!menuOptionDispatch.containsKey(input)) {
            printStream.println("Select a valid option!");
            input = bufferedReader.readLine();
        }

        return input;
    }

}

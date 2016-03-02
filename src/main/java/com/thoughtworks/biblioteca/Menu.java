package com.thoughtworks.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Menu {

    private PrintStream printStream;
    private BufferedReader bufferedReader;

    public Menu(PrintStream printStream, BufferedReader bufferedReader) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
    }

    public void showMenu() {
        printStream.println("Main Menu");
        printStream.println("Options (choose one):");
        printStream.println("1. List Books");
    }

    public int getUserSelection() throws IOException {
        String input = bufferedReader.readLine();
        return Integer.parseInt(input);
    }
}

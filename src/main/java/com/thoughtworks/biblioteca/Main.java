package com.thoughtworks.biblioteca;

public class Main {

    public static void main(String[] args) {
        new WelcomeMessage(System.out).print();

        new Library(System.out).printBooks();
    }

}

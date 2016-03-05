package com.thoughtworks.biblioteca;

public class CheckoutBookCommand implements Command {
    private Library library;

    public CheckoutBookCommand(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        library.startCheckoutBookProcess();
    }
}

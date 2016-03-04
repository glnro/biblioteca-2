package com.thoughtworks.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CheckoutBookCommandTest {

    @Test
    public void shouldStartCheckoutProcess() {
        Library library = mock(Library.class);
        CheckoutBookCommand checkoutBookCommand = new CheckoutBookCommand(library);

        checkoutBookCommand.execute();

        verify(library).checkoutBook();
    }

}
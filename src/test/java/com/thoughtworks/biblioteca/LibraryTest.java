package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class LibraryTest {
    private Library library;
    private List<Book> books;
    private Book book1;
    private Book book2;
    private BufferedReader reader;
    private PrintStream printStream;

    @Before
    public void setUp() throws IOException {
        books = new ArrayList<Book>();
        reader = mock(BufferedReader.class);
        printStream = mock(PrintStream.class);
        when(reader.readLine()).thenReturn("1");

        library = new Library(books,reader,printStream);


        book1 = mock(Book.class);
        book2 = mock(Book.class);
        addTwoBooksToBookArray();
    }

    @Test
    public void shouldPrintABook(){
        library.printBooks();
        verify(book1).printBookDetails();
    }


    @Test
    public void shouldPrintTwoBooksWhenGivenTwoBooks(){
        library.printBooks();

        verify(book2).printBookDetails();
    }

    @Test
    public void shouldCheckoutTheFirstBookWhenCalledWithIndexOne() throws IOException {
        when(reader.readLine()).thenReturn("1");

        library.startCheckoutBookProcess();

        verify(book1).checkout();
    }

    @Test
    public void shouldCheckoutSecondBookWhenCalledWithIndexTwo() throws IOException {
        when(reader.readLine()).thenReturn("2");

        library.startCheckoutBookProcess();

        verify(book2).checkout();

    }

    @Test
    public void shouldReceiveBookInputWhenStartingCheckoutBookProcess() throws IOException {
        library.startCheckoutBookProcess();

        verify(reader).readLine();
    }

    @Test
    public void shouldPrintRequestForInputWhenCheckoutProcessStarts(){
        library.startCheckoutBookProcess();

        verify(printStream).println(contains("Please enter the book number you would like to checkout"));
    }

    @Test
    public void shouldPrintThankYouWhenCheckoutProcessStarts(){
        library.startCheckoutBookProcess();

        verify(printStream).println(contains("Thank You! Enjoy the book!"));
    }



    private void addTwoBooksToBookArray() {
        books.add(book1);
        books.add(book2);
    }

}
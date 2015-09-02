package com.thoughtworks.tddintro.library;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.*;

public class LibraryTest {

    List<String> books;
    private PrintStream printStream;
    private String title;
    private Library library;
    private DateTime time = new DateTime();
    private DateTimeFormatter dateTimeFormatter;

    /*

        List books tests. Implement the first three tests for the Verify exercise

     */

    @Before
    public void initialize()
    {
        books = new ArrayList<>();
        title = "Book title";
        printStream = mock(PrintStream.class);

        time = new DateTime();
        dateTimeFormatter = mock(DateTimeFormatter.class);

        library = new Library(books, printStream, dateTimeFormatter);
    }

    @Test
    //@Ignore
    public void shouldPrintBookTitleWhenThereIsOneBook() {

        books.add(title);

        library.listBooks();

        // add a verify statement here that shows that the book title was printed by to the printStream
        verify(printStream).println(title);
    }

    @Test
    public void shouldPrintNothingWhenThereAreNoBooks() {

        // implement me

        library.listBooks();

        verify(printStream, times(0)).println();
    }

    @Test
    //@Ignore
    public void shouldPrintBothBookTitlesWhenThereAreTwoBooks() {

        // implement me

        String title2 = "Book Title 2";
        books.add(title);
        books.add(title2);

        library.listBooks();

        // add a verify statement here that shows that the book title was printed by to the printStream
        verify(printStream).println(title);
        verify(printStream).println(title2);
    }

    /*

        Welcome message tests. Implement these tests for the when/thenReturn exercise

     */

    
    // This one is done for you
    @Test
    public void shouldWelcomeUser() {

        // We don't need to mock DateTime because it is a value object
        // We can't mock it because it is a final class
        DateTime time = new DateTime();
        
        library.welcome(time);
        
        verify(printStream).println(contains("Welcome"));
    }

    @Test
    public void shouldDisplayFormattedTimeWhenFormattedTimeIsAnEmptyString() {

        when(dateTimeFormatter.print(time)).thenReturn("");

        library.welcome(time);

        // add a verify here

        verify(printStream).println("Welcome to the library! The current time is ");
    }

    @Test
    public void shouldDisplayFormattedTimeWhenFormattedTimeIsNotEmpty() {

        // implement me
        // then move common test variables into a setup method

        String t = "10:31 PM";

        when(dateTimeFormatter.print(time)).thenReturn(t);

        library.welcome(time);

        // add a verify here

        verify(printStream).println("Welcome to the library! The current time is " + t);
    }
}
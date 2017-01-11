package com.thoughtworks.biblioteca;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import java.util.ArrayList;

/**
 * Created by gmartine on 1/11/17.
 */
public class LibraryTest {

    @Test
    public void shouldReturnWelcome(){
       Library library = new Library();
       library.start();
       assertThat(library.start(), is("Welcome"));
    }

    @Test
    public void shouldReturnList(){
        Library library = new Library();
        ArrayList<String> listOfBooks = new ArrayList();
        assertThat(library.printListOfBooks(), is(listOfBooks));

    }

    @Test
    public void shouldReturnBookName(){
        Library library = new Library();
        ArrayList<String> listOfBooks = new ArrayList();
        String
        assertThat(library.printListOfBooks(), is(listOfBooks));
    }

}
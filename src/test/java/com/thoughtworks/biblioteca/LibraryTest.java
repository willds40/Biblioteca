package com.thoughtworks.biblioteca;
import static org.junit.Assert.assertThat;


import org.junit.Test;

import static org.junit.Assert.*;
import org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;

/**
 * Created by gmartine on 1/11/17.
 */
public class LibraryTest {

    @Test
    public void shouldReturnWelcome(){
       Library library = new Library();
       library.start();
       assertThat(library.start(), org.hamcrest.CoreMatchers.is("Welcome"));
    }

    @Test
    public void shouldReturnList(){
        Library library = new Library();
        ArrayList<String> listOfBooks = new ArrayList();
        assertThat(library.printListOfBooks(), org.hamcrest.CoreMatchers.is(listOfBooks));

    }

}
package com.sanushi.junit.exercises;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import  java.lang.IndexOutOfBoundsException;
import java.util.Arrays;

public class UtilitiesTest {

    @Test
    public void add() {
        Utilities utilities = new Utilities();
        int sum = utilities.add(10, 90);
        assertEquals("Incorrect Sum", 100, sum);
    }

    @Ignore ("This test is ignored for now. As it is out of scope.")
    @Test
    public void printGrade() {
        Utilities utilities = new Utilities();
        String result = utilities.printGrade(65);
        assertEquals("You got an A", result);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void getElement() {
        // Here we are actually expecting an IndexOutOfBoundsException because the arraylist doesn't hv any
        // elements yet.
        new ArrayList<>().get(0);
    }

    @Test (expected = ArithmeticException.class)
    public void testDivideByZero() {
        // Here we are actually expecting an ArithmeticException
       int x = 10/0;
    }


    @Test
    public void testAssertThatHasItems() {
        // assertThat(3, is(3));
        // assertThat("Sanushi", startsWith("Sal"));
        // assertThat("Sanushi", startsWith("San"));
        // assertThat(3, is(not(4)));
        // assertThat(3, is(not(3)));
        assertThat(Arrays.asList("Java", "Kotlin", "Scala"), hasItems("Java", "Kotlin"));
    }

}
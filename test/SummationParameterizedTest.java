package com.sanushi.junit.exercises;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SummationParameterizedTest {

    private int num1;
    private int num2;
    private int expected;

    public SummationParameterizedTest(int num1, int num2, int expected) {
        this.num1 = num1;
        this.num2 = num2;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object> data() {
        return Arrays.asList(new Object[][] {
                {2, 2, 4},
                {1, 4, 5},
                {10,  20, 30},
                {250, 100, 300},
                {1, 0, 1},
                {9, 1, 10}
        });
    }

    @Test
    public void testSummation() {
        assertThat("Incorrect sum", new Utilities().add(num1, num2), is(expected));
    }

}
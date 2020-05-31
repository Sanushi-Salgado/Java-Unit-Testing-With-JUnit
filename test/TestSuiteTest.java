package com.sanushi.junit.exercises;

import com.sanushi.junit.basics.BankAccountTest;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Author - Sanushi Salgado
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        SampleAssertionsTest.class,
        BankAccountTest.class
})

public class TestSuiteTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Started to execute test suite");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Completed executing test suite");
    }

}

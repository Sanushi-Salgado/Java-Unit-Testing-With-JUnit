package com.sanushi;

import org.junit.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;

public class BankAccountTest {

    private static int count;
    private BankAccount bankAccount;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Starting to execute test cases. Count: " + count);
    }

    @Before
    public void setup() {
        bankAccount = new BankAccount("San", "Sal", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @Test
    public void deposit() throws Exception {
//      fail("This method has not yet been implemented");
        double balance = bankAccount.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    @Test
    public void withdraw_branch() throws Exception {
        double balance = bankAccount.withdraw(600.00, true);
        assertEquals(400, balance, 0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void withdraw_notBranch() throws Exception {
        // The test actually passes. We want the method to throw an IllegalArgumentException.
       bankAccount.withdraw(600.00, false);
    }

    @Test
    public void getBalance_deposit() throws Exception {
        bankAccount.deposit(200.00, true);
        assertEquals(1200.00, bankAccount.getBalance(), 0);
    }

    @Test
    public void getBalance_withdraw() throws Exception {
        bankAccount.withdraw(200.00, true);
        assertEquals(800.00, bankAccount.getBalance(), 0);
    }

    @Test
    public void isChecking_true() throws Exception {
//      assertEquals(true, bankAccount.isChecking());
        assertTrue("This account is not a checking account", bankAccount.isChecking());
    }

    @After
    public void tearDown() {
        System.out.println("Count: " + count++);
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Completed execution of test cases. Count: " + count);
    }

}
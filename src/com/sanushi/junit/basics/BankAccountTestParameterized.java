package com.sanushi.junit.basics;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class BankAccountTestParameterized {
    private BankAccount bankAccount;
    private double amount;
    private boolean branch;
    private double expected;

    public BankAccountTestParameterized(double amount, boolean branch, double expected) {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @Before
    public void setup() {
        bankAccount = new BankAccount("San", "Sal", 1000.00, BankAccount.CHECKING);
        System.out.println("Running Utilities test...");
    }

    @Parameterized.Parameters
    public static Collection<Object> testConditions() {
        return Arrays.asList(new Object[][] {
                {100.00, true, 1100.00},
                {200.00, true, 1200.00},
                {325.14, true, 1325.14},
                {489.33, true, 1489.33},
                {1000.00, true, 2000.00}
        });
    }

    @Test
    public void deposit() throws Exception {
        bankAccount.deposit(amount, branch);
//        assertEquals(expected, bankAccount.getBalance(), 0);
        assertEquals(expected, bankAccount.getBalance(), 0.01);
    }


}

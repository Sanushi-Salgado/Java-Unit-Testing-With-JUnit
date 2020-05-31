package com.sanushi.junit.exercises;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SampleAssertionsTest {
    private Object obj;
    private String str;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Starting to execute SampleAssertionsTest");
    }

    @Test
    public void testAssertArrayEquals() {
        // byte[] expected = "text".getBytes();
        // byte[] actual = "test".getBytes();
        // assertArrayEquals("Fail - byte arrays r not d same", expected, actual);

        int[] arr1 = {2, 3, 4, 5};
        int[] arr2 = {2, 5, 4, 5};
        assertArrayEquals("Fail - arrays r not d same", arr1, arr2);

        // int[] arr1 = { 2, 3, 4, 5 };
        // int[] arr2 = { 4, 5, 2, 3 };
        // byte[] actual = "test".getBytes();
        // assertArrayEquals("Fail - arrays r not d same", arr1, arr2);
    }

    @Test
    public void testAssertEquals() {
//        assertEquals("Fail - Strings r not d same", "text", "test");
//        assertEquals("Fail - Objects r not equal", new Object(), new Object());
//        assertEquals("Fail - Objects r not equal", new String("San"), new String("Sal"));
        assertEquals("Fail - Objects r not equal", new String("San"), new String("San"));
    }

    @Test
    public void testAssertNotEquals() {
        // assertNotEquals("Fail - Strings should not be equal", "test", "test");
        assertNotEquals("Fail - Strings should not be equal", "text", "test");
    }

    @Test
    public void testAssertFalse() {
        // assertFalse("Fail - should be false", true);
        assertFalse("Fail - should be false", false);
    }

    @Test
    public void testAssertTrue() {
        // assertTrue("Fail - should be true", false);
        assertTrue("Fail - should be true", true);

    }

    @Test
    public void testAssertNotNull() {
        // assertNotNull("Fail - shouldn't be null", new Object());
        // assertNotNull("Fail - shouldn't be null", null);
        // assertNotNull("Fail - shouldn't be null", obj);
        // assertNotNull("Fail - shouldn't be null", str);
        str = "";
        assertNotNull("Fail - shouldn't be null", str);
    }

    @Test
    public void testAssertNull() {
        // assertNull("Fail - should be null", new Object());
        // assertNull("Fail - shouldn't be null", obj);
        // assertNull("Fail - shouldn't be null", str);
        // str = "";
        // assertNull("Fail - should be null", str);
        assertNull("Fail - shouldn't be null", null);
    }


    @Test
    public void testAssertSame() {
        // assertSame("Should be same", 10, 100);
        // assertSame("Should be same", 100, 100);
        // assertSame("Should be same", new Object(), new Object());

        // assertSame() - compares the object references
         assertSame("Should be same", new String("San"), new String("San"));
    }


    @Test
    public void testAssertNotSame() {
        // assertNotSame("Should be same", new Object(), new Object());

        // Object obj1 = new Object();
        // Object obj2 = obj1;
        // When we assign one object to another object, both object will now have the same reference
        // assertNotSame("Should be same", obj1, obj2);

        //String str1 = "San";
        // String str2 = "Sal";
        // assertNotSame("Should be same", str1, str2);

        String str1 = "San";
        String str2 = "San";
        assertNotSame("Should be same", str1, str2);

    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Completed executing SampleAssertionsTest");
    }


}
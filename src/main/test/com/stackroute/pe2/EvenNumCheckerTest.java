package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumCheckerTest {

    EvenNumChecker evenNumChecker;

    @Before
    public void setUp() throws Exception {
        evenNumChecker = new EvenNumChecker();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isEven() {

        assertTrue(evenNumChecker.isEven(312));
    }

    @Test
    public void isOdd() {
        boolean expectedValue=false;
        boolean actualValue=evenNumChecker.isEven(313);
        assertEquals(expectedValue,actualValue);

    }
    @Test
    public void isNotOdd() {
        boolean expectedValue=false;
        boolean actualValue=evenNumChecker.isEven(312);
        assertNotEquals(expectedValue,actualValue);
    }
    @Test
    public void isNotEven() {
        boolean expectedValue=true;
        boolean actualValue=evenNumChecker.isEven(313);
        assertNotEquals(expectedValue,actualValue);
    }
}
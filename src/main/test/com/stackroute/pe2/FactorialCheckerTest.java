package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialCheckerTest {

    FactorialChecker factorialChecker;

    @Before
    public void setUp() throws Exception {
        factorialChecker = new FactorialChecker();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void longFactorial() {

        assertEquals(120,FactorialChecker.longFactorial(5));
        assertEquals(2,FactorialChecker.longFactorial(2));
        assertEquals(1,FactorialChecker.longFactorial(0));
    }
}
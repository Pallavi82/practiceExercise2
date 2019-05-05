package com.stackroute.pe2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourCheckerTest {

    PowerOfFourChecker powerOfFourChecker;

    @Before
    public void setUp() throws Exception {
        powerOfFourChecker = new PowerOfFourChecker();
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void checkForPowerOfFour()
    {
        String result = powerOfFourChecker.checkForPowerOfFour(64);
        assertEquals("Num is power of 4", result);
    }

}
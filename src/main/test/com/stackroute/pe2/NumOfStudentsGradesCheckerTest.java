package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumOfStudentsGradesCheckerTest {

    NumOfStudentsGradesChecker numOfStudentsGradesChecker;

    @Before
    public void setUp() throws Exception {
        numOfStudentsGradesChecker = new NumOfStudentsGradesChecker();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void average() {
        int inputArray[]={25,25,25,25};
        assertEquals(25,numOfStudentsGradesChecker.average(inputArray));
        assertNotEquals(100,numOfStudentsGradesChecker.average(inputArray));
    }

    @Test
    public void lowest() {
        int inputArray[]={49,33,34,57};
        assertEquals(33,numOfStudentsGradesChecker.lowest(inputArray));
        assertNotEquals(49,numOfStudentsGradesChecker.lowest(inputArray));
    }

    @Test
    public void highest() {
        int inputArray[]={241,243,2504,294};
        assertEquals(2504,numOfStudentsGradesChecker.highest(inputArray));
        assertNotEquals(294,numOfStudentsGradesChecker.highest(inputArray));
    }

}
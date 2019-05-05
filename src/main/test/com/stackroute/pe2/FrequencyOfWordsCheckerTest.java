package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;

public class FrequencyOfWordsCheckerTest {

    FrequencyOfWordsChecker frequencyOfWordsChecker;

    @Before
    public void setUp() throws Exception {
       frequencyOfWordsChecker = new FrequencyOfWordsChecker();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkWordFrequency() throws IOException {
        File file = new File("/home/pallavi/IdeaProjects/PE2/src/main/imp.txt");
        assertEquals(21,(long)frequencyOfWordsChecker.checkWordFrequency(file.getAbsolutePath()));
        assertNull("null is expected",frequencyOfWordsChecker.checkWordFrequency(""));
    }
}
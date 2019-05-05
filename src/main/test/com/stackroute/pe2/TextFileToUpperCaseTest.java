package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Text;

import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;

public class TextFileToUpperCaseTest {

    private static TextFileToUpperCase textFileToUpperCase;

    @Before
    public void setUp() throws Exception {

        textFileToUpperCase = new TextFileToUpperCase();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getUpperCase() throws IOException {

        File file = new File("/home/pallavi/IdeaProjects/PE2/src/main/imp.txt");
        assertEquals("hello, is it me you are looking for? i can see it in your eyes 12345678@#$%.",textFileToUpperCase.getUpperCase(file.getAbsolutePath()));
        assertNull("The return value should be null",textFileToUpperCase.getUpperCase(""));
    }
}
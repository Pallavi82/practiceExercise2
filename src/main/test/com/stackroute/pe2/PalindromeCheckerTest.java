package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckerTest {

    PalindromeChecker palindromeChecker;

    @org.junit.Before
    public void setUp() throws Exception {
        palindromeChecker = new PalindromeChecker();
    }


    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkForPalindrome(){

        String result = palindromeChecker.checkForPalindrome(11211);
        assertEquals("Number is Palindrome.",result);

    }

    @Test
    public void checkForNotAPalindrome(){

        String result = palindromeChecker.checkForPalindrome(3465);
        assertEquals("Number not a Palindrome.", result);

    }
    @Test
    public void checkForNegativePalindrome(){

        String result = palindromeChecker.checkForPalindrome(55);
        assertEquals("Number is a Negative Palindrome.", result);

    }

}
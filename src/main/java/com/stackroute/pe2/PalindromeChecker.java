package com.stackroute.pe2;

public class PalindromeChecker {

    public String checkForPalindrome(int num) {
        int temp = num;
        int rev = 0;
        int rem;
        String result="";
        while(temp > 0 || temp<0) {
            rem = temp % 10;
            rev = (rev * 10) + rem;
            temp= temp/10;
        }

        if(num>0)
        {
            if (rev == num)
                result="Number is Palindrome.";
            else
                result="Number not a Palindrome.";

        }
        else if(num<0) {
            if (rev == num) {
                result="Number is a Negative Palindrome.";
            } else {
                result="Number not a Palindrome";
            }
        }
        return result;
    }
}

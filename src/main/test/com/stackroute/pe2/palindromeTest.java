package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class palindromeTest {
    //Arrange
    palindrome Palindrome;
    int num;
    @Before
    public void setUp() throws Exception {

        Palindrome = new palindrome();
    }
    @After
    public void tearDown() throws Exception {
        Palindrome = null;
    }
        @Test
    public void testfindPalindrome() throws Exception {
        // Act
        num =    Palindrome.findPalindrome(8668);
        // Assert
        assertEquals(1,num);
    }
    @Test
    public void testfindPalindrome1() throws Exception {
        // Act
        num = Palindrome.findPalindrome(8663);
        // Assert
        assertEquals(2,num);
    }

}
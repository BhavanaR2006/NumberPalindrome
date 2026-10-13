package com.example;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class AppTest {

@Test
public void testPalindromeNumber() {
    App obj = new App();
    assertTrue(obj.isPalindrome(121));
}

@Test
public void testNonPalindromeNumber() {
    App obj = new App();
    assertFalse(obj.isPalindrome(123));
}

@Test
public void testSingleDigitNumber() {
    App obj = new App();
    assertTrue(obj.isPalindrome(7));
}

}
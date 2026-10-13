package com.example;

public class App {

public boolean isPalindrome(int n) {
    if (n < 0) {
        return false;
    }

    int original = n;
    int reversed = 0;
    int number = n;

    while (number != 0) {
        int digit = number % 10;
        reversed = reversed * 10 + digit;
        number = number / 10;
    }

    return original == reversed;
}

public static void main(String[] args) {
    App obj = new App();

    int number = 121;

    if (obj.isPalindrome(number)) {
        System.out.println(number + " is a Palindrome");
    } else {
        System.out.println(number + " is not a Palindrome");
    }
}

}
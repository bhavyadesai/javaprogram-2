package com.stackroute.pe2;

public class palindrome {
    public static int findPalindrome(int num) {
        int sum = 0, rem = 0, temp, output;
        temp = num;
        while (num > 0) {
            rem = num % 10;
            sum = (sum * 10) + rem;
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println("given input is a palindrome");
            output = 1;
        } else {
            System.out.println("not a palindrome");
            output = 2;
        }
        return output;
    }
}


package com.java.oop.strings;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        String input = sc.next();
        String str = "";
        String rev = new StringBuilder(str).reverse().toString();
        if(str.equals(rev)){
            System.out.println("palindrome");
        }
        else
            System.out.println("not palindrome");
    }
}

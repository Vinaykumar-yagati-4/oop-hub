package com.java.oop.strings;

import java.util.Scanner;

public class StringPalindrome {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the data");
//        String input = sc.next();
//        String str = "";
//        String rev = new StringBuilder(str)
//        .reverse()
//        .toString();
//        if(str.equals(rev)){
//            System.out.println("palindrome");
//        }
//        else
//            System.out.println("not palindrome");
//    }

    static void main(String[] args) {
        String str = "vinay";
        String rev = "";
        for(int i = str.length()-1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("palindrome");
        }
        else
            System.out.println("not palindrome");
    }
}

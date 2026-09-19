package com.java.oop.strings;

public class ReverseStrings {
//    public static void main(String[] args) {
//        String str = "java";
//        String rev = "";
//        for(int i = str.length()-1; i >= 0; i--){
//             rev = rev + str.charAt(i);
//        }
//
//        System.out.println(rev);
//    }

    // using stringBuilder
    static void main(String[] args) {
       String str = "java";
       String reverse = new StringBuilder(str)
               .reverse()
               .toString();
        System.out.println(reverse);
    }
}

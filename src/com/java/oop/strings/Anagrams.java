package com.java.oop.strings;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "care";
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        System.out.println(Arrays.equals(a1,a2));
    }
}

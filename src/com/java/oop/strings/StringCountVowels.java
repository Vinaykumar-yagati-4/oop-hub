package com.java.oop.strings;

public class StringCountVowels {
    public static void main(String[] args) {
        String str = "hello";
        int count = 0;
        for (char ch : str.toCharArray()){
            if("aeiouAEIOU".indexOf(ch) != -1){
                count++;
            }
        }
        System.out.println(count);
    }
}

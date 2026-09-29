package com.java.oop.strings;

import java.util.HashMap;
import java.util.Map;


public class CharacterFrequency {
    static void main(String[] args) {
        String str = "soumya";
        Map<Character,Integer> frequency = new HashMap<>();
        for(char ch : str.toCharArray()){
            frequency.put(ch,frequency.getOrDefault(ch,0)+1);
        }
        System.out.println(frequency);
    }
}
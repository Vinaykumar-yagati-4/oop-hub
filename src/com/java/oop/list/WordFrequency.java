package com.java.oop.list;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "java is easy and java is powerful";
        String[] words = sentence.split(" ");
        Map<String,Integer> frequency = new HashMap<>();
        for(String word : words){
            frequency.put(word,frequency.getOrDefault(word,0)+1);
        }
        System.out.println(frequency);
    }
}

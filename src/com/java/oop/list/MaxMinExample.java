package com.java.oop.list;

import java.util.List;

public class MaxMinExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,25,40,50);

        int max = numbers.stream()
                .max(Integer::compareTo)
                .get();

        int min = numbers.stream()
                .min(Integer::compareTo)
                .get();

        System.out.println("Maximum :" +max);
        System.out.println("Minimum :" +min);
    }
}

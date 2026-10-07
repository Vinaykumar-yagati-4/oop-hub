package com.java.oop.list;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,20,30,40,20,50,10,30);
        Set<Integer> seen = new HashSet<>();

        numbers.stream()
                .filter(number -> !seen.add(number))
                .forEach(System.out::println);
    }
}

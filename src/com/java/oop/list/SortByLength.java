package com.java.oop.list;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class SortByLength {
    public static void main(String[] args) {
        List<String> names = List.of("tarun","anil","vinay","soumya");
        List<String> sortedNames = names.stream()
                .sorted((a,b) -> Integer.compare(a.length(),b.length()))
                .toList();

        System.out.println(sortedNames);
    }
}

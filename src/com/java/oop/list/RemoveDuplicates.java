package com.java.oop.list;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30,10,40,20,30,50);
        Set<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);
        System.out.println(uniqueNumbers);
    }
}

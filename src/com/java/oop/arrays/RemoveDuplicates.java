package com.java.oop.arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
//        int arr[] = {1,1,2,3,3,4,5,6};
//        int j = 0;
//
//        for(int i = 1; i < arr.length; i++) {
//            if(arr[i] != arr[j]) {
//                j++;
//                arr[j] = arr[i];
//            }
//        }
//
//        for (int i = 0; i <= j; i++) {
//            System.out.println(arr[i] + "");
//        }



        //using linked hashset

        int[] numbers = {20,10,40,30,40,50,10,30,60};
        Set<Integer> set = new LinkedHashSet<>();

        for (int number : numbers){
            set.add(number);
        }
        System.out.println(set);
    }
}



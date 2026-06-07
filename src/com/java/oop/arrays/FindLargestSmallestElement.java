package com.java.oop.arrays;

public class FindLargestSmallestElement {
    public static void main(String[] args) {
        int arr[] = {6,8,3,4};
        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i < arr.length - 1; i++){
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }
        System.out.println("max:" +max);
        System.out.println("min:" +min);
    }
}

package com.java.oop.arrays;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {10,35,69,85,99};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int num: arr){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }else if(num > secondLargest && num != largest){
                secondLargest = num;
            }
        }
        System.out.println("Second largest Number :" +secondLargest);
    }
}

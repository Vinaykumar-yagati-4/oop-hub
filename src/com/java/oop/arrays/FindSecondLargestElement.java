package com.java.oop.arrays;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        int[] numbers = {10,30,50,70,90};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int number : numbers){
            if(number > largest){
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;

            }
        }
        System.out.println("Largest :" +largest);
        System.out.println("Second Largest :" +secondLargest);
    }
}

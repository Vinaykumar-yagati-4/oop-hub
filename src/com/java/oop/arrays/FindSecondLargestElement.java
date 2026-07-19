package com.java.oop.arrays;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {10,35,69,85,99};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int num: arr){
            if(num > first){
                second = first;
                first = num;
            }else if(num > second && num != first){
                second = num;
            }
        }
        System.out.println("Second largest Number :" +second);
    }
}

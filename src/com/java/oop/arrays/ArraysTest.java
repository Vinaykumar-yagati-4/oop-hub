package com.java.oop.arrays;

public class ArraysTest {
    public  static  void findHighestElement(int[] element){
        int highestElement = element[0];
        for(int i = 1; i < element.length; i++){
            if(element[i] > highestElement){
                highestElement = element[i];
            }
        }
        System.out.println("Highest Elememt :" +highestElement);
    }

    public  static int[] sortingArrayOfElements(int[] element){
        int[] sortedArray = element;
        int temp;
        for(int i = 0; i < sortedArray.length; i++){
            for(int j = i + 1; j < sortedArray.length; j++){
                if(sortedArray[i] > sortedArray[j]){
                    temp = sortedArray[j];
                    sortedArray[j] = sortedArray[i];
                    sortedArray[i] = temp;
                }
            }
        }
        return  sortedArray;
    }

    static void main(String[] args) {
        int[] elements = {2,1,6,4,3,9};
        findHighestElement(elements);
        int[] sortedElements = sortingArrayOfElements(elements);
        for( int i = 0; i < sortedElements.length; i++){
            System.out.println(sortedElements[i]);

        }
    }
}

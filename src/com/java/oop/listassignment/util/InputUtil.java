package com.java.oop.listassignment.util;

import java.util.Scanner;

public class InputUtil {
    private static final Scanner sc = new Scanner(System.in);

    public static int getInt(String message){
        System.out.println(message);
        return sc.nextInt();
    }
    public  static String getString(String message){
        System.out.println(message);
        return sc.next();
    }
}

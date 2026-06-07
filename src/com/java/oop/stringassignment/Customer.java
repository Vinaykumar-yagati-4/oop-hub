package com.java.oop.stringassignment;

public class Customer {
    int id;
    byte age;
    char gender;
    String name;
    String email;
    long mobileNumber;

    //argument constuctor
    public Customer(int id, byte age, char gender, String name, String email, long mobileNumber) {
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    // no-argument constructor
    public Customer() {
        System.out.println("constructor called ");
        id = 111;
        age = 25;
        gender = 'M';
        name = "satya";
        email = "satya@gmail.com";
        mobileNumber = 9876543210L;



    }
}

package com.java.oop.methodsassignment;

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

    void displayCustomerDetails(){
        System.out.println("enter id :"+id);
        System.out.println("enter age :"+age);
        System.out.println("enter name :"+name);
        System.out.println("enter gender :"+gender);
        System.out.println("enter email :"+email);
        System.out.println("enter mobile no :"+mobileNumber);
    }
}

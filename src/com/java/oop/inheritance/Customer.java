package com.java.oop.inheritance;

public class Customer {
    int id;
    String name;
    String email;
    byte age;
    long mobileNo;
    double productPrice;

    public Customer(int id, String name, String email, byte age, long mobileNo, double productPrice) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.mobileNo = mobileNo;
        this.productPrice = productPrice;
    }
    public void displayCustomerDetails(){
        System.out.println("customer name : " +name);
        System.out.println("Product Price : " +productPrice);
    }
}

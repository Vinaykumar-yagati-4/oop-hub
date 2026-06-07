package com.java.oop.inheritance;

public class RegularCustomer extends Customer {
    double SHIPPING_CHARGE = 50;
    String membership = "silver";


    public RegularCustomer(int id, String name, String email, byte age, long mobileNo, double productPrice) {
        super(id, name, email, age, mobileNo, productPrice);
    }
    public  double calculateFinalPrice(){
        return productPrice + SHIPPING_CHARGE;
    }
    public void displayDetails(){
        displayCustomerDetails();
        System.out.println("Type: Regular Customer");
        System.out.println("Membership :" +membership);
        System.out.println("Final Price :" +calculateFinalPrice());
    }
}

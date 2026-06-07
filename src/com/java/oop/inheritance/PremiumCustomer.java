package com.java.oop.inheritance;

public class PremiumCustomer extends Customer{
    String membership = "Gold";
    double DISCOUNT = 0.20;


    public PremiumCustomer(int id, String name, String email, byte age, long mobileNo, double productPrice) {
        super(id,name,email,age,mobileNo,productPrice);
    }

    public  double calculateFinalPrice(){
        return  productPrice -(productPrice *DISCOUNT);
    }
    public void displayDetails(){
        displayCustomerDetails();
        System.out.println("Type : Premium customer");
        System.out.println("membership :" +membership);
        System.out.println("Final Price :" +calculateFinalPrice());
    }
}

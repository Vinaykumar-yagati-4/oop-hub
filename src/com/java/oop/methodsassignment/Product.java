package com.java.oop.methodsassignment;

public class Product {
    int id;
    String name;
    int maxRetailPrice;
    float rating;
    int reviewsCount;
    byte discountPercentage;
    boolean isAvailable;
    String company;
    String category;
    byte displaySize;
    short manufacturedYear;


    public Product() {
        id = 333;
        name = "dell laptop";
        maxRetailPrice = 10000;
        isAvailable = true;
        company = "dell";
        category = "laptop";

    }

    public Product(int id, String name, int maxRetailPrice,  boolean isAvailable, String company, String category) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.isAvailable = isAvailable;
        this.company = company;
        this.category = category;

    }

    void displayProductDetails(){
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Max Retail Price: " + maxRetailPrice);
        System.out.println("Rating: " + rating);
        System.out.println("Reviews Count: " + reviewsCount);
        System.out.println("Discount Percentage: " + discountPercentage);
        System.out.println("Is Available: " + isAvailable);
        System.out.println("Company: " + company);
    }
}

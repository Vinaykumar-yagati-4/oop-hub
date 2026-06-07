package com.java.oop.stringassignment;

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
}

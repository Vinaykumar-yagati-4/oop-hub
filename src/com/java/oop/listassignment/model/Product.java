package com.java.oop.listassignment.model;

public class Product {
    public int id;
    public String name;
    public String category;
    public int maxRetailPrice;

    public Product(int id, String name, String category, int maxRetailPrice) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.maxRetailPrice = maxRetailPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", maxRetailPrice=" + maxRetailPrice +
                '}';
    }
}

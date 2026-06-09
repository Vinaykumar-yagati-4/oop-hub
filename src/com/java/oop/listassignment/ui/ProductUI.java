package com.java.oop.listassignment.ui;

import com.java.oop.listassignment.model.Product;
import com.java.oop.listassignment.util.InputUtil;

public class ProductUI {
    public Product getProductDetails(){
        System.out.println("Enter the Product Details");
        int id = InputUtil.getInt("Enter the Id :");
        String name = InputUtil.getString("Enter the name :");
        String category = InputUtil.getString("Enter the category :");
        int maxRetailPrice = InputUtil.getInt("Enter the MRP :");
        return new Product(id,name,category,maxRetailPrice);
    }

    public int userOptionMenu(){
        System.out.println("\n----- PRODUCT MANAGEMENT DETAILS -----");
        System.out.println("1.Add Product");
        System.out.println("2.Display All Products");
        System.out.println("3.Search Products");
        System.out.println("4.Update Products");
        System.out.println("5.Delete Products");
        System.out.println("6.Exit");
        int choice = InputUtil.getInt("Enter your choice");
        return choice;
    }
}

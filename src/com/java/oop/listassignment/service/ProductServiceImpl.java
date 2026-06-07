package com.java.oop.listassignment.service;

import com.java.oop.listassignment.exception.ProductExistsException;
import com.java.oop.listassignment.exception.ProductNotFoundException;
import com.java.oop.listassignment.model.Product;
import com.java.oop.listassignment.ui.ProductUI;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService{
    private final List<Product> productList = new ArrayList<>();

    @Override
    public void add(Product product) {
        for (Product p : productList) {
            if (p.id == product.id) {
                throw new ProductExistsException("Product Already Exists");
            }
        }
        productList.add(product);
        System.out.println("Product added Successfully");
    }

    @Override
    public Product findProductById(int id) {
        for(Product product : productList){
            if(product.id == id){
                System.out.println(product);
                return product;
            }
        }
        throw new ProductNotFoundException("Product not found with this id :" +id);
    }

    @Override
    public void findAllProducts() {
        if(productList.isEmpty()){
            System.out.println("No product is there");
            return;
        }
        for(Product product : productList){
            System.out.println(product);
        }

    }

    @Override
    public void update(int id) {
        try{
            Product existProduct = findProductById(id);
            ProductUI ui = new ProductUI();
            Product newProduct = ui.getProductDetails();
            existProduct.id = newProduct.id;
            existProduct.name = newProduct.name;
            existProduct.category = newProduct.category;
            existProduct.maxRetailPrice = newProduct.maxRetailPrice;
            System.out.println("Product Updated Successfully");
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void delete(Product product) {
        productList.remove(product);
        System.out.println("Product removed Successfully");
    }

    @Override
    public void deleteById(int id) {
        try {
            Product product = findProductById(id);
            productList.remove(product);
            System.out.println("Product removed successfully");
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}

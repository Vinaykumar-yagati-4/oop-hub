package com.java.oop.listassignment.service;

import com.java.oop.listassignment.model.Product;

public interface ProductService {
    public void add(Product product);
    public Product findProductById(int id);
    void findAllProducts();
    void update(int id);
    void delete(Product product);
    void deleteById(int id);

}

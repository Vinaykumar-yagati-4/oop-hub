package com.java.oop.stringassignment;

public class Cart {
    String addToCart;
    String updateCart;
    String deleteItem;

    public Cart() {
        addToCart = "Item Added";
        updateCart = "Cart Updated Successfully";
        deleteItem = "Item Deleted Successfully";
    }

    public Cart(String addToCart, String updateCart, String deleteItem) {
        this.addToCart = addToCart;
        this.updateCart = updateCart;
        this.deleteItem = deleteItem;
    }
}

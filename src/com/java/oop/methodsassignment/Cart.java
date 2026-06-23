package com.java.oop.methodsassignment;

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

    void displayCartDetails(){
        System.out.println("Add to cart :"+addToCart);
        System.out.println("Update to cart :"+updateCart);
        System.out.println("Delete from cart :"+deleteItem);
    }
}

package com.java.oop.methodsassignment;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        // Product -> class name,  product -> reference variable

        product.displayProductDetails();
        System.out.println("-----------------------------------");

        Product product1 = new Product();
        product1.displayProductDetails();
        System.out.println("-----------------------------------");

        Customer customer = new Customer();
        customer.displayCustomerDetails();
        System.out.println("-----------------------------------");

        Customer customer2 = new Customer();
        customer2.displayCustomerDetails();
        System.out.println("---------------------------------------");

        Customer customer3 = new Customer();
        customer3.displayCustomerDetails();
        System.out.println("---------------------------------------");

        Customer customer5 = new Customer(111, (byte) 25, 'M', "dhoni", "dhoni@gmail.com", 7654321890L);
        customer5.displayCustomerDetails();
        System.out.println("---------------------------------------");

        Product product2 = new Product();
        product2.displayProductDetails();
        System.out.println("---------------------------------------");

        Product product4 = new Product(444, "dell", 1000000, true, "laptop", "dell");
        product4.displayProductDetails();
        System.out.println("---------------------------------------");

        //Order details
        Order order1 = new Order();
        order1.displayOrderDetails();
        System.out.println("---------------------------------------");

        Order order2 = new Order(1001029876L, "21-4-2026", "pending", true, false, 190267549L, "standard", "27-4-2026");
        order2.displayOrderDetails();
        System.out.println("---------------------------------------");

        //payment updated
        Payment payment = new Payment();
        payment.displayPaymentDetails();
        System.out.println("---------------------------------------");

        Payment payment1 = new Payment("TX205678912", 1500, "pending", "card", false);
        payment1.displayPaymentDetails();
        System.out.println("---------------------------------------");

        Cart cart = new Cart();
        cart.displayCartDetails();
        System.out.println("---------------------------------------");

        Cart cart1 = new Cart();
        cart1.displayCartDetails();
    }
}

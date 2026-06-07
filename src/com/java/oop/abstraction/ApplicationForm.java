package com.java.oop.abstraction;

public class ApplicationForm {
    int id;
    String applicationName;
    Customer customer;

    public ApplicationForm(int id, String applicationName, Customer customer) {
        this.id = id;
        this.applicationName = applicationName;
        this.customer = customer;
    }
}

package com.java.oop.abstraction;

public class Mro {
    int id;
    String name;
    int money;

    public Mro(int id, String name, int money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }
    Certificate generateCertificate(ApplicationForm form){
        Certificate certificate = null;
        if(money > 500){
            certificate = new Certificate(1,"date of birth","vinay",form.customer.name,"06-05-2026");
        }
        return certificate;
    }
}

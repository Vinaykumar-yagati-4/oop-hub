package com.java.oop.abstraction;

public class Attender {
    int money;
    String name;
    Mro mro;

    public Attender(int money, String name, Mro mro) {
        this.money = money;
        this.name = name;
        this.mro = mro;
    }
    Certificate processCertificate(ApplicationForm form){
        if(money > 500){
            return mro.generateCertificate(form);
        }else {
            return null;
        }
    }
}

package com.java.oop.abstraction;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1,"customer1","customer1@gmail.com",9876508754L,"12347689007654");
        ApplicationForm applicationForm = new ApplicationForm(1,"Birth Certificate",customer);
        Mro mro = new Mro(1,"vinay",1000);
        Attender attender = new Attender(1000,"charan",mro);
        CertificateService certificateService = new CertificateServiceImpl(attender);
        Certificate certificate = certificateService.getCertificate(applicationForm);
        PrintService printService = new NormalPrintService();
        printService.PrintCertificate(certificate);
    }
}

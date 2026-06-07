package com.java.oop.abstraction;

public class ColorPrintService extends PrintService {
    @Override
    public void PrintCertificate(Certificate certificate) {
        System.out.println("Printing Certificate in colour");
        System.out.println("Id :" +certificate.id
                +"\n Name :" +certificate.name
                +"\n IssuedTo : " +certificate.issuedTo
                +"\n IssuedBy :" +certificate.issuedBy
                +"\n IssuedDate :" +certificate.issuedDate);
    }
}

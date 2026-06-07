package com.java.oop.abstraction;

public class NormalPrintService extends PrintService {
    @Override
    public void PrintCertificate(Certificate certificate) {
        System.out.println("Printing Certificate in black & white");
        System.out.println("Id :" +certificate.id
                +"\n Name :" +certificate.name
                +"\n IssuedTo : " +certificate.issuedTo
                +"\n IssuedBy :" +certificate.issuedBy
                +"\n IssuedDate :" +certificate.issuedDate);
    }
}

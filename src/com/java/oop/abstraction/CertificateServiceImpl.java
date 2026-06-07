package com.java.oop.abstraction;

public class CertificateServiceImpl extends CertificateService {
    Attender attender;
    CertificateServiceImpl(Attender attender){
        this.attender = attender;
    }

    @Override
    public Certificate getCertificate(ApplicationForm form) {
        return attender.processCertificate(form);
    }
}

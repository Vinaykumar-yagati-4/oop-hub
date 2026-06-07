package com.java.oop.stringassignment;

public class Payment {
    String transactionId;
    double amount;
    String status;
    String paymentMode;
    boolean isPaymentSuccessful;

    public Payment() {
        transactionId = "T26041812374";
        amount = 1000;
        status = "success";
        paymentMode ="UPI";
        isPaymentSuccessful = true;
    }

    public Payment(String transactionId, double amount, String status, String paymentMode, boolean isPaymentSuccessful) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.status = status;
        this.paymentMode = paymentMode;
        this.isPaymentSuccessful = isPaymentSuccessful;
    }
}

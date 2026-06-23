package com.java.oop.methodsassignment;

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

    void displayPaymentDetails(){
        System.out.println("Transaction Id :"+transactionId);
        System.out.println("Enter the amount :"+amount);
        System.out.println("Status :"+status);
        System.out.println("Payment mode :"+paymentMode);
        System.out.println("Check the payment :"+isPaymentSuccessful);
    }
}

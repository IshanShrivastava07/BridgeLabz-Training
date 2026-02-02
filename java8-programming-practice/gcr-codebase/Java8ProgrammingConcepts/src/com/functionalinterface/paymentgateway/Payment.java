package com.functionalinterface.paymentgateway;

interface PaymentProcessor {
    void pay();

    default void refund() {
        System.out.println("Refund processed");
    }
}

class UPIProcessor implements PaymentProcessor {
    public void pay() {
        System.out.println("UPI payment done");
    }
}

public class Payment {
    public static void main(String[] args) {
        PaymentProcessor p = new UPIProcessor();
        p.pay();
        p.refund();
    }
}


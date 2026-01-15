package com.bridgelabz.callcenter;

public class CallCenterMain {
    public static void main(String[] args) {

        CallCenter center = new CallCenter();

        center.receiveCall(new Customer(1, "Ravi", false, 0));
        center.receiveCall(new Customer(2, "Neha", true, 5));
        center.receiveCall(new Customer(3, "Amit", false, 0));
        center.receiveCall(new Customer(4, "Sonal", true, 10));

        System.out.println(center.attendCall().name); // Sonal
        System.out.println(center.attendCall().name); // Neha
        System.out.println(center.attendCall().name); // Ravi
        System.out.println(center.attendCall().name); // Amit

        System.out.println("Neha calls: " + center.getCallCount(2));
    }
}

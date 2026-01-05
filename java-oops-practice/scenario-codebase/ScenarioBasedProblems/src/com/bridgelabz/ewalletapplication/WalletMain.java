package com.bridgelabz.ewalletapplication;

public class WalletMain {
    public static void main(String[] args) {
        User u1 = new User(true);
        User u2 = new User(false);

        u1.load(500);
        u1.transferTo(u2, 200);

        System.out.println(u1.checkBalance());
        System.out.println(u2.checkBalance());
    }
}


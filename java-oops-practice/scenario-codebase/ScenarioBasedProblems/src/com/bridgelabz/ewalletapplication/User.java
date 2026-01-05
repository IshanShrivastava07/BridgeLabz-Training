package com.bridgelabz.ewalletapplication;

public class User implements Transferrable {
    private Wallet wallet;

    public User(boolean referral) {
        wallet = new Wallet(referral ? 100 : 0);
    }

    public void load(double amount) {
        wallet.addMoney(amount);
    }

    public void transferTo(User receiver, double amount) {
        wallet.deduct(amount);
        receiver.wallet.addMoney(amount);
    }

    public double checkBalance() {
        return wallet.getBalance();
    }
}

package com.multithreading.bankingsystem;

class BankAccount {
    int balance = 10000;

    boolean withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
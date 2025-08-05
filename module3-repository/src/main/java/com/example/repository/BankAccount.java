package com.example.repository;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Withdrawal must be greater than zero.");
            return false;
        } else if (amount > balance) {
            System.out.println("Insufficient funds! Withdrawal failed.");
            return false;
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful: " + amount);
            return true;
        }
    }

    public double getBalance() {
        return balance;
    }
}

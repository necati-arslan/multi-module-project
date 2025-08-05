package com.example.service;

import com.example.repository.BankAccount;

public class BankService {

    public void processWithdrawal(BankAccount account, double amount) {
        boolean success = account.withdraw(amount);
        if (success) {
            System.out.println("Final Balance: " + account.getBalance());
        }
    }
}

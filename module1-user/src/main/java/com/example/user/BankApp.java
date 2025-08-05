package com.example.user;

import com.example.repository.BankAccount;
import com.example.service.BankService;

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 1000.0);
        BankService service = new BankService();

        service.processWithdrawal(account, 300.0);
    }
}

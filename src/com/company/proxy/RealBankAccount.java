package com.company.proxy;

public class RealBankAccount implements BankAccount {
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount);
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrew " + amount);
    }
}

package com.company.proxy;

public class LoggingProxy implements BankAccount {
    private RealBankAccount realAccount;

    public LoggingProxy(RealBankAccount realAccount) {
        this.realAccount = realAccount;
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Logging: Depositing " + amount);
        realAccount.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Logging: Withdrawing " + amount);
        realAccount.withdraw(amount);
    }
}

package com.company.proxy;

public class Client {
    public static void main(String[] args) {
        // Create the real bank account
        RealBankAccount realAccount = new RealBankAccount();

        // Create a logging proxy for the real bank account
        BankAccount proxyAccount = new LoggingProxy(realAccount);

        // Perform operations through the proxy
        proxyAccount.deposit(100.0);
        proxyAccount.withdraw(50.0);
    }
}

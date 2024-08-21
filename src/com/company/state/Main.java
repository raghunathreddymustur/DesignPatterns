package com.company.state;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(2);

        vendingMachine.insertCoin();  // Output: Coin inserted.
        vendingMachine.selectProduct();  // Output: Product selected. Dispensing product. Product released.

        vendingMachine.insertCoin();  // Output: Coin inserted.
        vendingMachine.ejectCoin();  // Output: Coin ejected.

        vendingMachine.insertCoin();  // Output: Coin inserted.
        vendingMachine.selectProduct();  // Output: Product selected. Dispensing product. Product released. Machine is out of stock.

        vendingMachine.insertCoin();  // Output: Machine is out of stock.
    }
}


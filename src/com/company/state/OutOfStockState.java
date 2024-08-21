package com.company.state;

public class OutOfStockState implements State {
    private VendingMachine vendingMachine;

    public OutOfStockState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Machine is out of stock.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("No coin to eject.");
    }

    @Override
    public void selectProduct() {
        System.out.println("Machine is out of stock.");
    }

    @Override
    public void dispense() {
        System.out.println("Machine is out of stock.");
    }
}


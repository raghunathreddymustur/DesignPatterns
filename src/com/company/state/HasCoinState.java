package com.company.state;

public class HasCoinState implements State {
    private VendingMachine vendingMachine;

    public HasCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Coin ejected.");
        vendingMachine.setState(vendingMachine.getNoCoinState());
    }

    @Override
    public void selectProduct() {
        System.out.println("Product selected.");
        if (vendingMachine.getInventory() > 0) {
            vendingMachine.setState(vendingMachine.getDispensingState());
        } else {
            vendingMachine.setState(vendingMachine.getOutOfStockState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No product selected.");
    }
}


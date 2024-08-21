package com.company.state;

public class NoCoinState implements State {
    private VendingMachine vendingMachine;

    public NoCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted.");
        vendingMachine.setState(vendingMachine.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("No coin to eject.");
    }

    @Override
    public void selectProduct() {
        System.out.println("Please insert coin first.");
    }

    @Override
    public void dispense() {
        System.out.println("Please insert coin and select product first.");
    }
}

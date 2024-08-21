package com.company.state;

public class DispensingState implements State {
    private VendingMachine vendingMachine;

    public DispensingState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Please wait, dispensing in progress.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Cannot eject coin, dispensing in progress.");
    }

    @Override
    public void selectProduct() {
        System.out.println("Please wait, already dispensing.");
    }

    @Override
    public void dispense() {
        System.out.println("Dispensing product.");
        vendingMachine.releaseProduct();
        if (vendingMachine.getInventory() > 0) {
            vendingMachine.setState(vendingMachine.getNoCoinState());
        } else {
            vendingMachine.setState(vendingMachine.getOutOfStockState());
        }
    }
}


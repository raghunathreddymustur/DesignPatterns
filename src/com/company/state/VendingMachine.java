package com.company.state;

public class VendingMachine {
    private State noCoinState;
    private State hasCoinState;
    private State dispensingState;
    private State outOfStockState;

    private State currentState;
    private int inventory;

    public VendingMachine(int inventory) {
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        dispensingState = new DispensingState(this);
        outOfStockState = new OutOfStockState(this);

        this.inventory = inventory;
        if (inventory > 0) {
            currentState = noCoinState;
        } else {
            currentState = outOfStockState;
        }
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void ejectCoin() {
        currentState.ejectCoin();
    }

    public void selectProduct() {
        currentState.selectProduct();
        currentState.dispense();
    }

    public void releaseProduct() {
        if (inventory > 0) {
            inventory--;
            System.out.println("Product released. Remaining inventory: " + inventory);
        }
    }

    public int getInventory() {
        return inventory;
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getDispensingState() {
        return dispensingState;
    }

    public State getOutOfStockState() {
        return outOfStockState;
    }
}


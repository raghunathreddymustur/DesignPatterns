package com.company.memento;

import java.util.ArrayList;
import java.util.List;

// Originator class
class Game {
    private int health;
    private int positionX;
    private int positionY;
    private List<String> inventory;

    public Game(int health, int positionX, int positionY) {
        this.health = health;
        this.positionX = positionX;
        this.positionY = positionY;
        this.inventory = new ArrayList<>();
    }

    // Method to play the game (just simulating some changes)
    public void play() {
        health -= 10;
        positionX += 5;
        positionY += 3;
        inventory.add("Sword");
        System.out.println("Playing... Current state: " + this);
    }

    // Save the current state in a memento
    public GameMemento saveState() {
        return new GameMemento(health, positionX, positionY, inventory);
    }

    // Restore the state from a memento
    public void restoreState(GameMemento memento) {
        this.health = memento.getHealth();
        this.positionX = memento.getPositionX();
        this.positionY = memento.getPositionY();
        this.inventory = memento.getInventory();
    }

    @Override
    public String toString() {
        return "Game{health=" + health + ", positionX=" + positionX + ", positionY=" + positionY +
                ", inventory=" + inventory + '}';
    }
}


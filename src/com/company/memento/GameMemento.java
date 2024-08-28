package com.company.memento;

import java.util.ArrayList;
import java.util.List;

// Memento class that stores the state of the game
class GameMemento {
    private int health;
    private int positionX;
    private int positionY;
    private List<String> inventory;

    public GameMemento(int health, int positionX, int positionY, List<String> inventory) {
        this.health = health;
        this.positionX = positionX;
        this.positionY = positionY;
        this.inventory = new ArrayList<>(inventory); // Deep copy
    }

    public int getHealth() {
        return health;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public List<String> getInventory() {
        return new ArrayList<>(inventory); // Return a copy to prevent modification
    }
}

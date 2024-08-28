package com.company.memento;

import java.util.ArrayList;
import java.util.List;

class GameStateManager {
    private List<GameMemento> savedStates = new ArrayList<>();

    // Save the current game state
    public void saveGame(Game game) {
        savedStates.add(game.saveState());
        System.out.println("Game state saved.");
    }

    // Restore the last saved game state
    public void restoreGame(Game game) {
        if (savedStates.isEmpty()) {
            System.out.println("No saved states to restore.");
            return;
        }
        game.restoreState(savedStates.remove(savedStates.size() - 1));
        System.out.println("Game state restored: " + game);
    }}

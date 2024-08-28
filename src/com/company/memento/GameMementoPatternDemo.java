package com.company.memento;

// Client code
public class GameMementoPatternDemo {
    public static void main(String[] args) {
        Game game = new Game(100, 0, 0);
        GameStateManager manager = new GameStateManager();

        System.out.println("Initial state: " + game);

        // Simulate playing the game
        game.play();
        manager.saveGame(game);  // Save the game state

        // Simulate more playing
        game.play();
        manager.saveGame(game);  // Save again

        // Restore the last saved state
        manager.restoreGame(game);

        // Restore the previous state
        manager.restoreGame(game);
    }
}

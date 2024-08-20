package com.company.strategy;

public class Main {
    public static void main(String[] args) {
        NavigationSystem navigationSystem = new NavigationSystem();

        // Set the strategy to the fastest route
        // Set the strategy to the fastest route
        navigationSystem.setRouteStrategy(new FastestRouteStrategy());
        navigationSystem.navigate("New York", "Los Angeles");
        // Output: Calculating the fastest route from New York to Los Angeles

        // Set the strategy to the shortest route
        navigationSystem.setRouteStrategy(new ShortestRouteStrategy());
        navigationSystem.navigate("New York", "Los Angeles");
        // Output: Calculating the shortest route from New York to Los Angeles

        // Set the strategy to the scenic route
        navigationSystem.setRouteStrategy(new ScenicRouteStrategy());
        navigationSystem.navigate("New York", "Los Angeles");
        // Output: Calculating the most scenic route from New York to Los Angeles
    }
}


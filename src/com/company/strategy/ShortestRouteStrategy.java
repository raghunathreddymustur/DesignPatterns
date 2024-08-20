package com.company.strategy;

public class ShortestRouteStrategy implements RouteStrategy {
    @Override
    public void calculateRoute(String startLocation, String endLocation) {
        System.out.println("Calculating the shortest route from " + startLocation + " to " + endLocation);
        // Implementation for the shortest route
    }
}

package com.company.strategy;

public class FastestRouteStrategy implements RouteStrategy {
    @Override
    public void calculateRoute(String startLocation, String endLocation) {
        System.out.println("Calculating the fastest route from " + startLocation + " to " + endLocation);
        // Implementation for the fastest route
    }
}

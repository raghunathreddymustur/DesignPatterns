package com.company.strategy;

public class ScenicRouteStrategy implements RouteStrategy {
    @Override
    public void calculateRoute(String startLocation, String endLocation) {
        System.out.println("Calculating the most scenic route from " + startLocation + " to " + endLocation);
        // Implementation for the most scenic route
    }
}

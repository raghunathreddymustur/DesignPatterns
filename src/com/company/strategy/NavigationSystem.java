package com.company.strategy;

public class NavigationSystem {
    private RouteStrategy routeStrategy;

    // Method to set the strategy at runtime
    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    // Method to calculate the route
    public void navigate(String startLocation, String endLocation) {
        routeStrategy.calculateRoute(startLocation, endLocation);
    }
}


package com.company.decorator;

public class CoffeeShop {
    public static void main(String[] args) {
        // Start with a simple coffee
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        // Add milk to the coffee
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        // Add sugar to the coffee with milk
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        // Add whip to the coffee with milk and sugar
        coffee = new WhipDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());
    }
}




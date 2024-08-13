package com.company.decorator;

public class WhipDecorator extends CoffeeDecorator {
    public WhipDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Whip";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 2.0;
    }
}


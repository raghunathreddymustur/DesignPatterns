package com.company.observer;

// Main class to demonstrate the Observer pattern
public class Main {
    public static void main(String[] args) {
        Product product = new Product("PlayStation 5");

        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        product.registerObserver(customer1);
        product.registerObserver(customer2);

        // Product is out of stock initially
        product.setInStock(false);

        // After some time, the product is back in stock
        product.setInStock(true);
    }
}

package com.company.facade;

public class InventorySystem {
    public boolean checkStock(int productId) {
        System.out.println("Checking stock for product: " + productId);
        // Simplified stock check logic
        return true; // Assume the product is in stock
    }

    public void reduceStock(int productId, int quantity) {
        System.out.println("Reducing stock for product: " + productId + " by quantity: " + quantity);
    }
}

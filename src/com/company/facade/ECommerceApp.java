package com.company.facade;

public class ECommerceApp {
    public static void main(String[] args) {
        // Creating the facade
        OrderFacade orderFacade = new OrderFacade();

        // Placing an order
        int productId = 101;
        int quantity = 2;
        String paymentDetails = "Card Payment";
        String shippingAddress = "123 Street, City, Country";
        String email = "customer@example.com";

        orderFacade.placeOrder(productId, quantity, paymentDetails, shippingAddress, email);
    }
}


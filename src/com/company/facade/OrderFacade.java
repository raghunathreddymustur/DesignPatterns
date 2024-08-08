package com.company.facade;

public class OrderFacade {
    private InventorySystem inventory;
    private PaymentSystem payment;
    private ShippingSystem shipping;
    private NotificationSystem notification;

    public OrderFacade() {
        this.inventory = new InventorySystem();
        this.payment = new PaymentSystem();
        this.shipping = new ShippingSystem();
        this.notification = new NotificationSystem();
    }

    public void placeOrder(int productId, int quantity, String paymentDetails, String shippingAddress, String email) {
        System.out.println("Placing order for product: " + productId);

        // Step 1: Check Inventory
        if (!inventory.checkStock(productId)) {
            System.out.println("Product out of stock.");
            return;
        }

        // Step 2: Process Payment
        if (!payment.processPayment(paymentDetails)) {
            System.out.println("Payment failed.");
            return;
        }

        // Step 3: Reduce Stock
        inventory.reduceStock(productId, quantity);

        // Step 4: Arrange Shipping
        shipping.arrangeShipping(productId, shippingAddress);

        // Step 5: Send Notification
        int orderId = 123; // Assume order ID is generated
        notification.sendConfirmationEmail(email, orderId);

        System.out.println("Order placed successfully!");
    }
}


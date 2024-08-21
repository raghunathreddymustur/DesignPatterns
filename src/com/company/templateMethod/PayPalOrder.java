package com.company.templateMethod;

class PayPalOrder extends OrderProcessTemplate {
    @Override
    protected void processPayment() {
        System.out.println("Processing payment using PayPal.");
    }

    @Override
    protected void arrangeDelivery() {
        System.out.println("Arranging express delivery.");
    }
}


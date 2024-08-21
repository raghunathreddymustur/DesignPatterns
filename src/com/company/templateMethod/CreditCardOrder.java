package com.company.templateMethod;

class CreditCardOrder extends OrderProcessTemplate {
    @Override
    protected void processPayment() {
        System.out.println("Processing payment using Credit Card.");
    }

    @Override
    protected void arrangeDelivery() {
        System.out.println("Arranging standard delivery.");
    }
}


package com.company.templateMethod;

abstract class OrderProcessTemplate {

    public final void processOrder() {
        selectItems();
        applyDiscounts();
        processPayment();
        arrangeDelivery();
        sendConfirmation();
    }

    protected abstract void processPayment();
    protected abstract void arrangeDelivery();

    private void selectItems() {
        System.out.println("Items have been selected and added to the cart.");
    }

    private void applyDiscounts() {
        System.out.println("Discounts and coupons have been applied.");
    }

    private void sendConfirmation() {
        System.out.println("Order confirmation has been sent to the customer.");
    }
}

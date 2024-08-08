package com.company.facade;

public class NotificationSystem {
    public void sendConfirmationEmail(String email, int orderId) {
        System.out.println("Sending confirmation email to: " + email + " for order: " + orderId);
    }
}

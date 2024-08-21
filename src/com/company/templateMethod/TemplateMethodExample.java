package com.company.templateMethod;

public class TemplateMethodExample {
    public static void main(String[] args) {
        OrderProcessTemplate order1 = new CreditCardOrder();
        order1.processOrder();

        OrderProcessTemplate order2 = new PayPalOrder();
        order2.processOrder();
    }
}


package com.company.Factory.AbstractFactory;

class WindowsButton implements Button {
    public void paint() {
        System.out.println("Rendering a button in a Windows style.");
    }
}
package com.company.Factory.AbstractFactory;

class MacOSButton implements Button {
    public void paint() {
        System.out.println("Rendering a button in a MacOS style.");
    }
}

package com.company.Factory.AbstractFactory;

class MacOSCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Rendering a checkbox in a MacOS style.");
    }
}

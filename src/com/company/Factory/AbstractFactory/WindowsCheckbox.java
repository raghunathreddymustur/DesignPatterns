package com.company.Factory.AbstractFactory;

class WindowsCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Rendering a checkbox in a Windows style.");
    }
}

package com.company.Factory.FactoryMethod;

// Application.java
public abstract class Application {
    // Factory method
    public abstract Document createDocument();

    public void openDocument() {
        Document document = createDocument();
        document.open();
    }
}


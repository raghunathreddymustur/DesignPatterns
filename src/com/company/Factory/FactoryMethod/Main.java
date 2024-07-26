package com.company.Factory.FactoryMethod;

// Main.java
public class Main {
    public static void main(String[] args) {
        Application pdfApp = new PDFApplication();
        pdfApp.openDocument();

        Application wordApp = new WordApplication();
        wordApp.openDocument();
    }
}


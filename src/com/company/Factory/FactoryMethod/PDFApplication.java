package com.company.Factory.FactoryMethod;

public class PDFApplication extends Application {
    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}

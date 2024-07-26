package com.company.Factory.FactoryMethod;

public class WordApplication extends Application {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

package com.company.singletonpattern.template;

public class EagerSingleton {
    // Static variable to hold the single instance of the class
    private static final EagerSingleton instance = new EagerSingleton();

    // Private constructor to prevent instantiation
    private EagerSingleton() {
    }

    // Public method to provide access to the instance
    public static EagerSingleton getInstance() {
        return instance;
    }
}

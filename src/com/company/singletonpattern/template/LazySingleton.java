package com.company.singletonpattern.template;

public class LazySingleton {
    // Static variable to hold the single instance of the class
    private static LazySingleton instance;

    // Private constructor to prevent instantiation
    private LazySingleton() {
    }

    // Public method to provide access to the instance
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}

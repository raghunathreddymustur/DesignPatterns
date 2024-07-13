package com.company.singletonpattern.template;

public class ThreadSafeSingleton {
    // Static variable to hold the single instance of the class
    private static ThreadSafeSingleton instance;

    // Private constructor to prevent instantiation
    private ThreadSafeSingleton() {
    }

    // Public method to provide access to the instance, synchronized for thread safety
    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}

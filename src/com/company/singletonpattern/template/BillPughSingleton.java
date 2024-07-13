package com.company.singletonpattern.template;

public class BillPughSingleton {
    // Private constructor to prevent instantiation
    private BillPughSingleton() {
    }

    // Static inner class to hold the single instance of the class
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    // Public method to provide access to the instance
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

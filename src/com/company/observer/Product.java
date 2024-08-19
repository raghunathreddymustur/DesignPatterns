package com.company.observer;

import java.util.ArrayList;
import java.util.List;

// ConcreteSubject
class Product implements Subject {
    private List<Observer> observers;
    private String productName;
    private boolean inStock;

    public Product(String productName) {
        this.productName = productName;
        this.observers = new ArrayList<>();
        this.inStock = false;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if (inStock) {
            for (Observer observer : observers) {
                observer.update(productName);
            }
        }
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
        notifyObservers();
    }

    public String getProductName() {
        return productName;
    }
}


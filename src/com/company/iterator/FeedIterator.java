package com.company.iterator;

import java.util.List;

// Concrete implementation of the Iterator
class FeedIterator implements Iterator {
    private List<String> items;
    private int position = 0;

    public FeedIterator(List<String> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return items.get(position++);
        }
        return null;
    }
}

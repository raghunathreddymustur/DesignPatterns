package com.company.iterator;

import java.util.ArrayList;
import java.util.List;

// Concrete implementation of the SocialMediaFeed
class Feed implements SocialMediaFeed {
    private List<String> items;

    public Feed() {
        this.items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    @Override
    public Iterator createIterator() {
        return new FeedIterator(items);
    }
}

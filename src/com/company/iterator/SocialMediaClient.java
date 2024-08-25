package com.company.iterator;

// Client code
public class SocialMediaClient {
    public static void main(String[] args) {
        Feed feed = new Feed();
        feed.addItem("Post 1");
        feed.addItem("Image 1");
        feed.addItem("Video 1");

        Iterator iterator = feed.createIterator();

        while (iterator.hasNext()) {
            String item = (String) iterator.next();
            System.out.println("Item: " + item);
        }
    }
}

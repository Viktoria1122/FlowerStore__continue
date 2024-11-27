package ua.edu.ucu.apps.delivery;

import java.util.LinkedList;

import ua.edu.ucu.apps.flowerstore.Item;

class PostDeliveryStrategy implements Delivery {
    @Override
    public void deliver(LinkedList<Item> items) {
        System.out.println("Delivering items by Post.");
    }
}

package ua.edu.ucu.apps.delivery;

import java.util.LinkedList;

import ua.edu.ucu.apps.flowerstore.Item;

public interface Delivery {
    
    void deliver(LinkedList<Item> items);
}


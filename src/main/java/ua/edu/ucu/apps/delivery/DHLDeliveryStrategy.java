package ua.edu.ucu.apps.delivery;

import java.util.LinkedList;

import ua.edu.ucu.apps.flowerstore.Item; 

public class DHLDeliveryStrategy implements Delivery{

    @Override
    public void deliver(LinkedList<Item> items) {
        System.out.println("Delivering items by DHL.");
    }
}

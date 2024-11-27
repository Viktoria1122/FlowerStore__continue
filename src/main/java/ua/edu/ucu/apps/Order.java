package ua.edu.ucu.apps;

import java.util.LinkedList;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ua.edu.ucu.apps.delivery.Delivery;
import ua.edu.ucu.apps.flowerstore.Item;
import ua.edu.ucu.apps.payment.Payment;

@Getter
@Setter
@ToString
class Order {
    private LinkedList<Item> items = new LinkedList<>();
    private Payment payment;
    private Delivery delivery;

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double calculateTotalPrice() {
        return items.stream().mapToDouble(Item::price).sum();
    }

    public void processOrder() {
        double total = calculateTotalPrice();
        payment.pay(total);
        delivery.deliver(items);
    }
}
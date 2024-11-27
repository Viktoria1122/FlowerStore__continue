package ua.edu.ucu.apps.payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public void pay(double price) {
        System.out.println("Paying " + price + " using PayPal.");
    }
}

package ua.edu.ucu.apps.payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public void pay(double price) {
        System.out.println("Paying " + price + " using Credit Card.");
    }
}

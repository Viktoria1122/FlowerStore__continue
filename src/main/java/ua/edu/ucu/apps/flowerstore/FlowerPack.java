package ua.edu.ucu.apps.flowerstore;

public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flowerInstance, int quantityAmount) {
        this.flower = flowerInstance;
        this.quantity = quantityAmount;
    }

    public Flower getFlower() {
        return flower;
    }

    public void setFlower(Flower flowerInstance) {
        this.flower = flowerInstance;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantityAmount) {
        if (quantityAmount <= 0) {
            throw new IllegalArgumentException("Quantity must be positive.");
        }
        this.quantity = quantityAmount;
    }

    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}

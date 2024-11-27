package ua.edu.ucu.apps.flowerstore;

class RomashkaFlower extends Item {
    public RomashkaFlower() {
        description = "Romashka Flower";
    }

    @Override
    public double price() {
        return 20;
    }
}
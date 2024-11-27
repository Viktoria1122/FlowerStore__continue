package ua.edu.ucu.apps.flowerstore;

class CactusFlower extends Item {
    public CactusFlower() {
        description = "Cactus Flower";
    }

    @Override
    public double price() {
        return 30;
    }
}

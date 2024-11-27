package ua.edu.ucu.apps.flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final double DEFAULT_FLOWER_PRICE = 10.0;

    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
    }

    @Test
    public void testPrice() {
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Flower();
        flower.setFlowerType(FlowerType.ROSE);
        flower.setPrice(DEFAULT_FLOWER_PRICE);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        flowerBucket.add(flowerPack);
        
        double expectedPrice = flower.getPrice() * quantity;
        Assertions.assertEquals(expectedPrice, flowerBucket.getPrice());
    }
}

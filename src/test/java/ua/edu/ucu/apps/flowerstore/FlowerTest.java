package ua.edu.ucu.apps.flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class FlowerTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private static final double VALID_PRICE = 10.0;
    private static final double INVALID_PRICE = -5.0;
    private static final int INVALID_QUANTITY = -1;

    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    @Test
    public void testRandomPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }

    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color.toString());
        Assertions.assertEquals(color.toString(), flower.getColor());
    }

    @Test
    public void testPrice() {
        flower.setPrice(VALID_PRICE);
        Assertions.assertEquals(VALID_PRICE, flower.getPrice());
    }

    @Test
    public void testFlowerType() {
        FlowerType expectedType = FlowerType.ROSE;
        flower.setFlowerType(expectedType);
        Assertions.assertEquals(expectedType, flower.getFlowerType());
    }

    @Test
    public void testInvalidPrice() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            flower.setPrice(INVALID_PRICE);
        });
    }

    @Test
    public void testInvalidQuantity() {
        FlowerPack pack = new FlowerPack(flower, INVALID_QUANTITY);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            pack.setQuantity(INVALID_QUANTITY);
        });
    }
}

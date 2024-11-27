package ua.edu.ucu.apps.flowerstore;

import java.util.List;
import java.util.stream.Collectors;

public class Store {
    private List<Flower> flowers;

    public Store(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public List<Flower> search(FlowerType type,
                                FlowerColor color,
                                Double maxPrice) {
        return flowers.stream()
                .filter(flower -> (type == null 
                || flower.getFlowerType() == type)
                        && (color == null 
                        || flower.getColor().equals(color.toString()))
                        && (maxPrice == null || flower.getPrice() <= maxPrice))
                .collect(Collectors.toList());
    }
}

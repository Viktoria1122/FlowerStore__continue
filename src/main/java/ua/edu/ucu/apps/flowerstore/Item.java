package ua.edu.ucu.apps.flowerstore;

import lombok.*;

@Getter
public abstract class Item {
    @Setter
    protected String description;

    public abstract double price();
}

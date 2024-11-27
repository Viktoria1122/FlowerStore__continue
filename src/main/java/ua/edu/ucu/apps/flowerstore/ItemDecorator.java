package ua.edu.ucu.apps.flowerstore;

public abstract class ItemDecorator extends Item{

    protected Item item;

    public ItemDecorator(Item item) {
        this.item = item;
    }

    @Override
    public abstract String getDescription();
}

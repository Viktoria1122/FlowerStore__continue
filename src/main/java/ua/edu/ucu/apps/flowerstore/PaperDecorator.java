package ua.edu.ucu.apps.flowerstore;

public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double price() {
        return 13 + item.price();
    }

    @Override
    public String getDescription() {
        return item.getDescription() + ", wrapped in Paper";
    }
}

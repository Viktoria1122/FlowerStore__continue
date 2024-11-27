
package ua.edu.ucu.apps.flowerstore;

public class BusketDecorator extends ItemDecorator{
    public BusketDecorator(Item item) {
        super(item);
    }

    @Override
    public double price() {
        return 4 + item.price();
    }

    @Override
    public String getDescription() {
        return item.getDescription() + ", in Busket";
    }
}

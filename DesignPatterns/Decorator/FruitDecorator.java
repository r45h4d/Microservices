package Decorator;

public class FruitDecorator extends IceCreamDecorator{
    public FruitDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String order() {
        return super.order() + " + fruit";
    }
}

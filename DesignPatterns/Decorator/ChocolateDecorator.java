package Decorator;

public class ChocolateDecorator extends IceCreamDecorator{
    public ChocolateDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String order() {
        return super.order() + " + chocolate";
    }
}

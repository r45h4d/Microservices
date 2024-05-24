package Decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        IceCream plainIceCream = new PlainIceCream();
        System.out.println(plainIceCream.order());

        IceCream chocolateIceCream = new ChocolateDecorator(plainIceCream);
        System.out.println(chocolateIceCream.order());

        IceCream fruitIceCream = new FruitDecorator(plainIceCream);
        System.out.println(fruitIceCream.order());
    }
}

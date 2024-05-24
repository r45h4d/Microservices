package Decorator;

public class PlainIceCream implements IceCream{
    @Override
    public String order() {
        return "Plain ice cream";
    }
}

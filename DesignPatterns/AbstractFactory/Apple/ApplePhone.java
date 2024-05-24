package AbstractFactory.Apple;

import AbstractFactory.Phone;

public class ApplePhone implements Phone {
    @Override
    public void getModelName() {
        System.out.println("Iphone");
    }
}

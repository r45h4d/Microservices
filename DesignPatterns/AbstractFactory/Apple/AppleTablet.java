package AbstractFactory.Apple;

import AbstractFactory.Tablet;

public class AppleTablet implements Tablet {
    @Override
    public void getScreenSize() {
        System.out.println("9.6");
    }
}

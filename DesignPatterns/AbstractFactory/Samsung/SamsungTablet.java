package AbstractFactory.Samsung;

import AbstractFactory.Tablet;

public class SamsungTablet implements Tablet {
    @Override
    public void getScreenSize() {
        System.out.println("10.2");
    }
}

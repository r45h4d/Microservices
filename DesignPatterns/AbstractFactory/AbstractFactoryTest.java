package AbstractFactory;

import AbstractFactory.Samsung.SamsungFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        var factory = new SamsungFactory();
        var phone = factory.getPhone();
        var tablet = factory.getTablet();
        var laptop = factory.getLaptop();

        System.out.println("Samsung factory");
        phone.getModelName();
        tablet.getScreenSize();
        laptop.getOperatingSystemName();
    }
}

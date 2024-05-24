package AbstractFactory.Apple;

import AbstractFactory.Laptop;

public class AppleLaptop implements Laptop {
    @Override
    public void getOperatingSystemName() {
        System.out.println("MacOS");
    }
}

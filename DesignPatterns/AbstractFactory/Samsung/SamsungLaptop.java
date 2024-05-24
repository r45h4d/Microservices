package AbstractFactory.Samsung;

import AbstractFactory.Laptop;

public class SamsungLaptop implements Laptop {
    @Override
    public void getOperatingSystemName() {
        System.out.println("Windows");
    }
}

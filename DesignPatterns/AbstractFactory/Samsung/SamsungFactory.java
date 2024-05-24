package AbstractFactory.Samsung;

import AbstractFactory.Laptop;
import AbstractFactory.Phone;
import AbstractFactory.Tablet;
import AbstractFactory.TecnoFactory;

public class SamsungFactory implements TecnoFactory {
    @Override
    public Phone getPhone() {
        return new SamsungPhone();
    }

    @Override
    public Tablet getTablet() {
        return new SamsungTablet();
    }

    @Override
    public Laptop getLaptop() {
        return new SamsungLaptop();
    }
}

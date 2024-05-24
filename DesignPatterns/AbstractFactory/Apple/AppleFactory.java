package AbstractFactory.Apple;

import AbstractFactory.Laptop;
import AbstractFactory.Phone;
import AbstractFactory.Tablet;
import AbstractFactory.TecnoFactory;

public class AppleFactory implements TecnoFactory {
    @Override
    public Phone getPhone() {
        return new ApplePhone();
    }

    @Override
    public Tablet getTablet() {
        return new AppleTablet();
    }

    @Override
    public Laptop getLaptop() {
        return new AppleLaptop();
    }
}

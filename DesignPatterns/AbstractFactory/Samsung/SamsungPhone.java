package AbstractFactory.Samsung;

import AbstractFactory.Phone;

public class SamsungPhone implements Phone {
    @Override
    public void getModelName() {
        System.out.println("Flip");
    }
}

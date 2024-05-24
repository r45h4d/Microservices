package Builder;

public class BuilderTest {
    public static void main(String[] args) {
        CoffeeBuilder coffeeBuilder = new CoffeeBuilder.Builder(15.0).addSugar(5.0).build();
    }
}

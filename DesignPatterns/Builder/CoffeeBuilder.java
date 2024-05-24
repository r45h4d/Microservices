package Builder;

public class CoffeeBuilder {
    double coffeeAmount;
    double sugarAmount;
    double milkAmount;
    public static class Builder {
        private double coffeeAmount;
        private double sugarAmount;
        private double milkAmount;
        public Builder(double coffeeAmount) {
            this.coffeeAmount = coffeeAmount;
        }
        public Builder addSugar(double sugarAmount){
            this.sugarAmount = sugarAmount;
            return this;
        }
        public Builder addMilk(double milkAmount){
            this.milkAmount=milkAmount;
            return this;
        }

        public CoffeeBuilder build(){
            return new CoffeeBuilder(this);
        }
    }

    public CoffeeBuilder(Builder builder){
        coffeeAmount=builder.coffeeAmount;
        sugarAmount=builder.sugarAmount;
        milkAmount=builder.milkAmount;
    }
}

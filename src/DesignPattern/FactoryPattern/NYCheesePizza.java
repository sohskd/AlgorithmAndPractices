package DesignPattern.FactoryPattern;

public class NYCheesePizza extends Pizza {
    @Override
    public void bake() {
        System.out.println("Baking a NY cheese pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting a NY cheese pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing a NY cheese pizza");
    }
}

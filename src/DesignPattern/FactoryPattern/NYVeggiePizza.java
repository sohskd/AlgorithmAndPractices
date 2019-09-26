package DesignPattern.FactoryPattern;

public class NYVeggiePizza extends Pizza {
    @Override
    public void bake() {
        System.out.println("Baking a NY veggie pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting a NY veggie pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing a NY veggie pizza");
    }
}

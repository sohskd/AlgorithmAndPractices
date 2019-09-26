package DesignPattern.FactoryPattern;

public class ChicagoCheezePizza extends Pizza {
    @Override
    public void bake() {
        System.out.println("Baking a Chicago cheese pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting a Chicago cheese pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing a Chicago cheese pizza");
    }
}

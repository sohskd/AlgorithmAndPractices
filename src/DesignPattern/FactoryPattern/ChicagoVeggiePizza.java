package DesignPattern.FactoryPattern;

public class ChicagoVeggiePizza extends Pizza {
    @Override
    public void bake() {
        System.out.println("Baking a Chicago veggie pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting a Chicago veggie pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing a Chicago veggie pizza");
    }
}

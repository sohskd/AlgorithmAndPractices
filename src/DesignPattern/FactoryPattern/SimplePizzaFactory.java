package DesignPattern.FactoryPattern;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new ChicagoCheezePizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoVeggiePizza();
        }

        return pizza;
    }
}

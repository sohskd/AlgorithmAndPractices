package DesignPattern.FactoryPattern;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese": {
                System.out.println("Returning Chicago cheese pizza");
                return new ChicagoCheezePizza();
            }
            case "veggie": {
                System.out.println("Returning Chicago veggie pizza");
                return new ChicagoVeggiePizza();
            }
            default: {
                System.out.println("Returning Chicago invalid request");
                return null;
            }
        }
    }
}

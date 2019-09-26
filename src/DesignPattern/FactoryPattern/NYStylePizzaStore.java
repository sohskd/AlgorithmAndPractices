package DesignPattern.FactoryPattern;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese": {
                System.out.println("Returning NY cheese pizza");
                return new NYCheesePizza();
            }
            case "veggie": {
                System.out.println("Returning NY veggie pizza");
                return new NYVeggiePizza();
            }
            default: {
                System.out.println("Returning NY invalid request");
                return null;
            }
        }
    }
}

package DesignPattern.FactoryPattern;

public class Customer {

    public static void main(String[] args) {
        PizzaStore NYPizzaStore = new NYStylePizzaStore();
        Pizza NYpizza = NYPizzaStore.orderPizza("cheese");

        PizzaStore ChicagoPizzaStore = new ChicagoStylePizzaStore();
        Pizza ChicagoPizza = ChicagoPizzaStore.orderPizza("cheese");
    }
}

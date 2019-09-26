package DesignPattern.FactoryPattern;

public abstract class Pizza {

    public void prepare() {
        System.out.println("Prepare pizza");
    }
    
    public abstract void bake();

    public abstract void cut();

    public abstract void box();
}

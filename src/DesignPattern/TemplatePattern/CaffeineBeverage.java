package DesignPattern.TemplatePattern;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();

    }

    protected abstract void addCondiments();

    protected void pourInCup() {
        System.out.println("Pouring in cup!");
    }

    protected abstract void brew();

    protected void boilWater() {
        System.out.println("Boiling water!");
    }
}
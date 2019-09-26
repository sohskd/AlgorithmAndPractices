package DesignPattern.ObserverPattern;

public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();

    float getTemperature();

    float getHumidity();

    float getPressure();
}

package DesignPattern.ObserverPattern;

public class CurrentConditions implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditions(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(Subject subject) {
        this.temperature = subject.getTemperature();
        this.humidity = subject.getHumidity();
        display();
    }

    @Override
    public String toString() {
        return "CurrentConditions{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", weatherData=" + weatherData +
                '}';
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + " F degrees and " + humidity + "% humidity");
    }
}

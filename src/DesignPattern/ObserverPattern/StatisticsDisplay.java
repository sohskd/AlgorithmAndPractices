package DesignPattern.ObserverPattern;

public class StatisticsDisplay implements Observer {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(Subject subject) {
        this.temperature = subject.getTemperature();
        this.humidity = subject.getHumidity();
        display();
    }

    public void display() {
        if(temperature > 50)
            System.out.println("Statistic Display: It is Hot!");
        else
            System.out.println("Statistic Display: It is Cold!");
    }
}

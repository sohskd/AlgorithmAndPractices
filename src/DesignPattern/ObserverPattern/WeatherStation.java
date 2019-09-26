package DesignPattern.ObserverPattern;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditions currentConditions = new CurrentConditions(weatherData);
        StatisticsDisplay statisticDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(40, 65, 30.4f);

        weatherData.removeObserver(statisticDisplay);

        weatherData.setMeasurements(70, 65, 30.4f);
    }
}

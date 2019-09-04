package programmingPatterns.weather;

public class ForecastDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humidity;
    private final Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Прогноз: " +
                "\n------------" +
                "\nТекущие показания: " +
                "\n- температура: " + temperature +
                "\n- влажность: " + humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {

        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

}

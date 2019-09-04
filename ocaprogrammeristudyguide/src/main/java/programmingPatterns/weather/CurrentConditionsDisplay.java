package programmingPatterns.weather;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(Observable o) {
        this.observable = o;
        observable.addObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Текущие показания:" +
                "\n------------------" +
                "\n- температура: " + temperature +
                "\n- влажность: " + humidity +
                "\n- атмосферное давление:: " + pressure);
    }

    @Override
    public void update(Observable o, Object arg) {

        if (o instanceof WeatherData){
            WeatherData wd = (WeatherData) o;
            this.temperature = wd.getTemperature();
            this.humidity = wd.getHumidity();
            this.pressure = wd.getPressure();
            display();
        }
    }
}

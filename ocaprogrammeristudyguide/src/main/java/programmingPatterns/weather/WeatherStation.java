package programmingPatterns.weather;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData data = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(data);

        data.setMeasutements(28, 80, 31.4f);

    }
}

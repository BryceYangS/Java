package chapter2_Observer;

import chapter2_Observer.weather.CurrentConditionDisplay;
import chapter2_Observer.weather.StatisticsDisplay;
import chapter2_Observer.weather.WeatherData;
import chapter2_Observer.weatherWithJavaUtil.CurrnetConditionsDisplay;

public class WeatherStation {

  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

    weatherData.setMeasurement(80, 65, 30.4f);
    weatherData.setMeasurement(82, 70, 29.2f);

    System.out.println("============Observerable=================");

    chapter2_Observer.weatherWithJavaUtil.WeatherData weatherData1 = new chapter2_Observer.weatherWithJavaUtil.WeatherData();
    CurrnetConditionsDisplay currnetConditionsDisplay = new CurrnetConditionsDisplay(weatherData1);
    weatherData1.setMesurements(80, 65, 30.4f);
    weatherData1.setMesurements(82, 70, 29.2f);
    weatherData1.setMesurements(85, 70, 29.2f);


  }
}

package chapter2_Observer.weatherWithJavaUtil;

import chapter2_Observer.weather.DisplayElement;
import java.util.Observable;
import java.util.Observer;

public class CurrnetConditionsDisplay implements Observer, DisplayElement {

  Observable observable;
  private float temperature;
  private float humidity;

  public CurrnetConditionsDisplay(Observable observable) {
    this.observable = observable;
    observable.addObserver(this);
  }

  @Override
  public void update(Observable o, Object arg) {
    if (o instanceof WeatherData) {
      WeatherData weatherData = (WeatherData) o;
      this.temperature = weatherData.getTemperature();
      this.humidity = weatherData.getHumidity();
      display();
    }
  }

  @Override
  public void display() {
    System.out.println(
        "Current conditions : " + temperature + "F degrees and " + humidity + "% humidity");
  }
}
